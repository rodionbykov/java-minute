package com.rodionbykov.springboot.memcachedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MemcachedemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemcachedemoApplication.class, args);
    }
}
