package com.fb.springbootfbtest;

import com.fb.springbootfbtest.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.SpringVersion;

@SpringBootTest
class SpringbootfbtestApplicationTests {


    @Autowired
    private UserController userController;

    @Test
    void contextLoads() {
        userController.test();
    }

    @Test
    void tt() {
        userController.h();
    }

    @Test
    void testVersion() {
        System.out.println(SpringBootVersion.getVersion());
        System.out.println(SpringVersion.getVersion());

    }

}
