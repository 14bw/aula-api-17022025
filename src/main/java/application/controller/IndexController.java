package application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
>>>>>>> 87f641f (17022025)
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    
<<<<<<< HEAD
    @RequestMapping("/")
    public String home() {
        return "home";
    }
=======
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/")
    public String homePost() {
        return "home - POST";
    }
>>>>>>> 87f641f (17022025)
    
}