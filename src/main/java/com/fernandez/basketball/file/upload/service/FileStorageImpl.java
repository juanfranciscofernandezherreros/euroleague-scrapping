package com.fernandez.basketball.file.upload.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileStorageImpl implements FileStorage{

    Logger log = LoggerFactory.getLogger(this.getClass().getName());

    @Override
    public void store(MultipartFile file,String playByPlay){
         Path rootLocation = Paths.get("src/main/resources/"+playByPlay);
        try {
            Files.copy(file.getInputStream(), rootLocation.resolve(file.getOriginalFilename()));
        } catch (Exception e) {
            throw new RuntimeException("FAIL! -> message = " + e.getMessage());
        }
    }
}

