package com.jayden.springbootestdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationEvent;
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
        System.out.println(jdbcTemplate.queryForList("explain SELECT *\n" +
                "FROM (SELECT task.*\n" +
                "\tFROM ACT_RU_TASK task\n" +
                "\t\tLEFT JOIN bpm_task_read task_read ON task.id_ = task_read.TASK_ID\n" +
                "\t\tLEFT JOIN BPM_PRO_RUN run ON task.PROC_INST_ID_ = run.act_Inst_Id\n" +
                "\t\tLEFT JOIN act_ru_identitylink ident ON task.id_ = ident.TASK_ID_\n" +
                "\t\tLEFT JOIN sys_gl_type TYPE ON TYPE.type_id = run.type_id\n" +
                "\tWHERE ident.USER_ID_ = '990000255359065'\n" +
                "\t) tmp"));
    }
}
