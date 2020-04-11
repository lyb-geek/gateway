package com.github.lybgeek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ReactorGrayGateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReactorGrayGateWayApplication.class,args);
    }
}
