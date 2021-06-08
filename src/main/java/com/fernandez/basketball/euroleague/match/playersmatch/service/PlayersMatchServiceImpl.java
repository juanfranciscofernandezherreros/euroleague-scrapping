package com.fernandez.basketball.euroleague.match.playersmatch.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fernandez.basketball.commons.constants.UrlMapping;
import com.fernandez.basketball.euroleague.match.playersmatch.dto.PlayerMatch;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Slf4j
@Service
@RequiredArgsConstructor
public class PlayersMatchServiceImpl implements PlayersMatchService {

    @Override
    public PlayerMatch[] findPlayersMatchByTeam(String fileName)  throws IOException {
        final ObjectMapper objectMapper = new ObjectMapper();
        PlayerMatch[] playerMatch = objectMapper.readValue(new FileInputStream(UrlMapping.MAIN_RESOURCES+UrlMapping.PLAYERSMATCH+"/"+fileName+".json"),PlayerMatch[].class );
        return playerMatch;
    }

    @Override
    public PlayerMatch[] findPlayersMatchByTeamWitouthSync(String gameCode, String seassonCode, String teamCode) throws IOException {
        URL url = new URL("https://live.euroleague.net/api/Players?gamecode="+gameCode+"&seasoncode=E"+seassonCode+"&disp=&equipo="+teamCode+"&temp=E"+seassonCode);
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestProperty("authority", "live.euroleague.net");
        http.setRequestProperty("accept", "application/json, text/plain, */*");
        http.setRequestProperty("dnt", "1");
        http.setRequestProperty("sec-ch-ua-mobile", "?0");
        http.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.212 Safari/537.36");
        http.setRequestProperty("sec-fetch-site", "same-origin");
        http.setRequestProperty("sec-fetch-mode", "cors");
        http.setRequestProperty("sec-fetch-dest", "empty");
        ObjectMapper mapper=new ObjectMapper();
        BufferedReader in = new BufferedReader(new InputStreamReader(http.getInputStream()));
        PlayerMatch[] playerMatch = mapper.readValue(in, PlayerMatch[].class);
        return  playerMatch;
    }
}
