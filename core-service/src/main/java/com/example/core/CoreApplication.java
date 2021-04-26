package com.example.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class CoreApplication {
    @GetMapping("/")
    public String hello(){
        return "hello";
    }
    public static void main(String[] args) {
        SpringApplication.run(CoreApplication.class, args);
    }

}
