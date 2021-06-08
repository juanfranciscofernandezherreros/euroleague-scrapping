package com.fernandez.basketball.euroleague.match.evolution.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fernandez.basketball.commons.constants.UrlMapping;
import com.fernandez.basketball.euroleague.match.evolution.dto.Evolution;
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
public class EvolutionServiceImpl implements  EvolutionService{

    @Override
    public Evolution findAllEvolutionFromMatchInJsonFile(String fileName) throws IOException {
        final ObjectMapper objectMapper = new ObjectMapper();
        Evolution evolution = new ObjectMapper().readValue(new FileInputStream(UrlMapping.MAIN_RESOURCES+UrlMapping.EVOLUTION+"/"+fileName+".json"), Evolution.class );
        return evolution;
    }

    @Override
    public Evolution evolutionWitouthSync(String gameCode, String seassonCode) throws IOException {
        URL url = new URL("https://live.euroleague.net/api/Evolution?gamecode="+gameCode+"&seasoncode=E"+seassonCode);
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
        Evolution evolution = mapper.readValue(in, Evolution.class);
        return  evolution;
    }
}
