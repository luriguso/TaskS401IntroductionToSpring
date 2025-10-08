package cat.itacademy.s04.t01.n02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(name = "name") Optional<String> name) {
        return "Hola, " + name.orElse("UNKNOWN") + ". Estás ejecutando un proyecto Gradel";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    public String saluda2(@PathVariable Optional<String> name) {
        return "Hola, " + name.orElse("UNKNOWN") + ". Estás ejecutando un proyecto Gradel";
    }
}
