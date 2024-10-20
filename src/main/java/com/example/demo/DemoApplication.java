package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public static void moduleInitChecker() {
        ApplicationModules modules = ApplicationModules.of(DemoApplication.class);
        System.out.println(modules);
    }
}