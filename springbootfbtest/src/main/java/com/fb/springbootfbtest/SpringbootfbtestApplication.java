package com.fb.springbootfbtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootfbtestApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringbootfbtestApplication.class, args);
    }

}
