package com.jayden.springbootestdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @author 孙勇军（089245）
 * @since 2019/12/5
 */
@Component
public class DbVisitor implements ApplicationListener<ApplicationStartedEvent> {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println(jdbcTemplate.queryForList("select now()"));
    }
}
