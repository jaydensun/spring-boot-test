package com.jayden.springboottest.config;

import com.jayden.springboottest.domain.Person;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class BeanConfiguration {
    @Bean
    @ConfigurationProperties(prefix = "person.first")
    public Person firstPerson() {
        return new Person();
    }

    @Bean
    @ConfigurationProperties(prefix = "person.second")
    public Person secondPerson() {
        return new Person();
    }

    @Bean
    @ConfigurationProperties(prefix = "person.multi")
    public Map<String, Person> multiPerson() {
        return new HashMap<>();
    }


    @Bean
    @ConfigurationProperties(prefix = "person.multi2")
    public Map<String, Person> multi2Person() {
        return new HashMap<>();
    }
}
