package com.fernandez.basketball.euroleague.match.comparission.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fernandez.basketball.commons.constants.UrlMapping;
import com.fernandez.basketball.euroleague.match.comparission.dto.Comparission;
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
public class ComparissionServiceImpl implements ComparissionService{
    @Override
    public Comparission findComparisionFromJson(String fileName) throws IOException {
        final ObjectMapper objectMapper = new ObjectMapper();
        Comparission comparission = new ObjectMapper().readValue(new FileInputStream(UrlMapping.MAIN_RESOURCES+UrlMapping.COMPARISSION+"/"+fileName+".json"), Comparission.class );
        return comparission;
    }

    @Override
    public Comparission comparisionWitouthSync(String gameCode, String seassonCode) throws IOException {
        URL url = new URL(" https://live.euroleague.net/api/Comparison?gamecode="+gameCode+"&seasoncode=E"+seassonCode);
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
        Comparission headerDTO = mapper.readValue(in, Comparission.class);
        return  headerDTO;
    }
}
