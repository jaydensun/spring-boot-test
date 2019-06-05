package com.jayden.springboottest;

import com.jayden.springboottest.domain.Person;
import com.jayden.springboottest.domain.Redis;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

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
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleAtFixedRate(() -> {
            System.out.println(context.getBean(Redis.class));
        }, 0, 5, TimeUnit.SECONDS);
    }
}
