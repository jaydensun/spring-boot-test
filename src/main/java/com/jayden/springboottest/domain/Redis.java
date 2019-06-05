package com.jayden.springboottest.domain;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import lombok.Data;
import lombok.Setter;
import org.springframework.stereotype.Component;

@DisconfFile(filename = "redis.properties")
@Setter
@Data
@Component
public class Redis {
    private String host;
    private int port;

    @DisconfFileItem(name = "redis.host")
    public String getHost() {
        return host;
    }

    @DisconfFileItem(name = "redis.port")
    public int getPort() {
        return port;
    }
}
