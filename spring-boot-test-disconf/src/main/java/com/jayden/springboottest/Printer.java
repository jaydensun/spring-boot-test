package com.jayden.springboottest;

import com.jayden.springboottest.domain.Coefficients;
import com.jayden.springboottest.domain.Redis;
import com.jayden.springboottest.domain.Remote;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Service
public class Printer implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext context = event.getApplicationContext();

        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(() -> {
            System.out.println();
            System.out.println(new Date());
            System.out.println(context.getBean(Redis.class) + " ---- DISCONF 注解");
            System.out.println(context.getBean(Remote.class) + " ---- Spring @Value 注解");
            System.out.println(context.getBean(Coefficients.class) + " ---- Spring xml 占位符");
        }, 0, 2, TimeUnit.SECONDS);
    }
}
