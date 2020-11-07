package com.rodionbykov.soap.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoapServiceApplication {
    // adapted from https://spring.io/guides/gs/producing-web-service/
    public static void main(String[] args) {
        SpringApplication.run(SoapServiceApplication.class, args);
    }

}
