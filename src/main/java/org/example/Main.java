package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@MyAnnotation
@RequestMapping("/app")
public class Main {
    @GetMapping("/{name}")
    public String test(@PathVariable String name){
        return "Congratulation.."+name+", you are selected for the role..!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}