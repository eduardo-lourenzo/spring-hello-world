package br.edu.zup.spring_hello_world.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String responseMessage() {
        return "<h1 align=\"center\">Hello Spring Boot!</h1>";
    }
}
