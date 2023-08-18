package com.example.demo2.controller;

import com.example.demo2.entity.User;
import com.example.demo2.feign.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "companydemo2")
public class CompanyController {

    @Autowired
    private UserServiceFeign userServiceFeign;

    @PostMapping(value = "getUserList")
    @ResponseBody
    public List<User> getEmpResult2() {
        return userServiceFeign.getUserList(User.builder().id(231).username("fanbin").password("wx3424587575").build());
    }

}
