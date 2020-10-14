package me.fenghaiju.spring.oauth2.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello() {
        return "Hello";
    }
}
