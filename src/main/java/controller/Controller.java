package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class Controller {

    @RequestMapping("/getInfo")
    public void getAlbum(@RequestParam(value = "name") String name, @RequestParam(value = "artist") String artist) { }
}
