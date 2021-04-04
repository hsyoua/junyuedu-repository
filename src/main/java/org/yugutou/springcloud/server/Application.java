package org.yugutou.springcloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//表示Eureka服务中心
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
