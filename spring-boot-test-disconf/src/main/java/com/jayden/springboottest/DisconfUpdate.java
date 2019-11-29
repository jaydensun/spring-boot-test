package com.jayden.springboottest;

import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;
import com.jayden.springboottest.domain.Redis;
import org.springframework.stereotype.Service;

/**
 * @author sunyongjun
 * @since 2019/10/8
 */
@Service
//@DisconfUpdateService(confFileKeys = "redis.properties")
@DisconfUpdateService(classes = Redis.class)
public class DisconfUpdate implements IDisconfUpdate {
    @Override
    public void reload() throws Exception {
        System.out.println("reload");
    }
}
