package com.example.springbootdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Springbootdemo1Application {

    public static void main(String[] args) {

        SpringApplication.run(Springbootdemo1Application.class, args);
    }
}
