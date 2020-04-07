package com.mogila.controller;

import com.mogila.model.LastFmObject;
import com.owlike.genson.Genson;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;


@RestController
@RequestMapping(path = "/yourController")
public class Controller {
    public static final String PATH_TO_PROPERTIES = "src/main/resources/application.properties";


    @GetMapping("/info")
    public String getObject(@RequestParam(value = "name", defaultValue = "Believe") String name, @RequestParam(value = "artist", defaultValue = "Cher") String artist) {
        FileInputStream fileInputStream;
        Properties prop = new Properties();
        RestTemplate restTemplate = new RestTemplate();
        Genson genson = new Genson();
        String getRequest = null;

        try {
            fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
            prop.load(fileInputStream);

            String API_URL = prop.getProperty("API_URL");
            String API_KEY = prop.getProperty("API_KEY");
            String REQUEST_URL = prop.getProperty("REQUEST_URL");
            getRequest = API_URL + REQUEST_URL + "&api_key=" + API_KEY + "&artist=" + artist
                    + "&album=" + name + "&format=json";

        } catch (IOException e) {
            System.out.println("Ошибка в программе: файл " + PATH_TO_PROPERTIES + " не обнаружено");
            e.printStackTrace();
        }

        ResponseEntity<String> response = restTemplate.exchange(getRequest, HttpMethod.GET, null, String.class);

        LastFmObject lastFmObject = genson.deserialize(response.getBody(), LastFmObject.class);

        return lastFmObject.toString();

    }

}
