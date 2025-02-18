package application.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    
    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/")
    public String homePost() {
        return "home - POST";
    }
}