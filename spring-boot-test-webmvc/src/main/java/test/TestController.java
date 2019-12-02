package test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author 孙勇军（089245）
 * @since 2019/12/2
 */
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!" + new Date();
    }
}
