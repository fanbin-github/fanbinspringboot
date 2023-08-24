package com.example.springbootdemo1.controller;

import com.example.springbootdemo1.entity.User;
import com.example.springbootdemo1.service.CompanyService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "company")
@Slf4j
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

    @GetMapping(value = "getResultByResilience")
    @ResponseBody
    @CircuitBreaker(name="backendA",fallbackMethod = "getResultFailBack")
    public String getResultByResilience() {
        return companyService.getResultByResilience();
    }
    public String getResultFailBack(Integer id, Throwable throwable) {
        log.info("getResultFailBack id({}),exception is ({})", id, throwable.getClass());
        return "mock:Resul: " + id;
    }

}
