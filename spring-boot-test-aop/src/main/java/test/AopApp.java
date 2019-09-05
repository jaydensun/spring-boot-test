package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import test.biz.TestObject;

/**
 * @author sunyongjun
 * @since 2019/9/5
 */
@EnableAspectJAutoProxy
@SpringBootApplication
public class AopApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AopApp.class);
        context.getBean(TestObject.class).test();
    }
}
