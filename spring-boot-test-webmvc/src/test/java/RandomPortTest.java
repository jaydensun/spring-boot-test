import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * @author 孙勇军（089245）
 * @since 2019/12/2
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RandomPortTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testHello() {
        // 测试hello方法
        String result = restTemplate.getForObject("/hello", String.class);
        assertEquals("Hello World", result);
    }
}