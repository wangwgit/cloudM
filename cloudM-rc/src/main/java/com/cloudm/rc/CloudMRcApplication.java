package com.cloudm.rc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudMRcApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudMRcApplication.class, args);
    }
}
