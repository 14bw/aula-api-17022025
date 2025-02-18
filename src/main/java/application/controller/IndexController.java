package application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    List<String> frutas = new ArrayList<String>(List.of("Maça", "Banana", "Morango"));

    @GetMapping
    public List<String> home() {
        return frutas;

    }

    @PostMapping
    public List<String> homePost(@RequestBody String fruta) {
        frutas.add(fruta);
        return frutas;
    }
}
