package com.jayden.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude = PropertyPlaceholderAutoConfiguration.class)
@ImportResource("classpath:spring-config.xml")
public class DisconfApplication {
    public static void main(String[] args) {
        SpringApplication.run(DisconfApplication.class);
    }
}
