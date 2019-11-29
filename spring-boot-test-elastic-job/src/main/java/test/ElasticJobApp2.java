package test;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author sunyongjun
 * @since 2019/11/28
 */
@SpringBootApplication
public class ElasticJobApp2 {
    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(ElasticJobApp2.class).web(WebApplicationType.NONE).build().run();
    }
}
