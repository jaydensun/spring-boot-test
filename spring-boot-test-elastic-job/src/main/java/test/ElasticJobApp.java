package test;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author sunyongjun
 * @since 2019/11/28
 */
@SpringBootApplication
public class ElasticJobApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(ElasticJobApp.class).web(WebApplicationType.NONE).build().run();
    }
}
