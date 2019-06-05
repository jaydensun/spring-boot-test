package com.jayden.springboottest.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Remote {
    @Value("${remoteHost}")
    private String remoteHost;
    @Value("${remotePort}")
    private int remotePort;
}
