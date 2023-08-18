package com.example.springbootdemo1.controller;

import com.example.springbootdemo1.entity.User;
import com.example.springbootdemo1.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;


    @RequestMapping(value = "getEmpResult")
    @ResponseBody
    public String getEmpResult() {
        return companyService.getEmpResul();
    }

    @RequestMapping(value = "getEmpResult1")
    @ResponseBody
    public String getEmpResult1() {
        return companyService.getEmpResult1();
    }

    @PostMapping(value = "getEmpResult2")
    @ResponseBody
    public User getEmpResult2() {
        return companyService.getEmpResult2();
    }

}
