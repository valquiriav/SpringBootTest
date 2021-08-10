package br.com.letscode.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello-world")
@RestController
public class HelloWorldRestController {

    @GetMapping
    public String hello(){
        return "Hello World! I love Spring Boot S21!";
    }
}
