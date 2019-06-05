package com.jayden.springboottest;

import com.jayden.springboottest.domain.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

@Service
public class Printer implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext context = event.getApplicationContext();
        context.getBeansOfType(Person.class).forEach((k, v) -> {
            System.out.println(k + " " + v);
        });

        System.out.println(context.getBean("multiPerson"));
        System.out.println(context.getBean("multi2Person"));
    }
}
