package com.sharding.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author cy
 */
@SpringBootApplication(exclude = JtaAutoConfiguration.class)
@EnableEurekaServer
public class ShardingServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingServerApplication.class, args);
    }

}
