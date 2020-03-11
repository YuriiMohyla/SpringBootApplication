
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        String theUrl = "http://ws.audioscrobbler.com/2.0/?method=album.getinfo&api_key=21c7044646626e654f10a415e7680c50&artist=Cher&album=Believe&format=json";
        ResponseEntity<String> response = restTemplate.exchange(theUrl, HttpMethod.GET, null, String.class);
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(response.getBody());
        Album album = (Album) mapper.readValue(response.getBody(),Album.class);
        System.out.println(album);
    }
}