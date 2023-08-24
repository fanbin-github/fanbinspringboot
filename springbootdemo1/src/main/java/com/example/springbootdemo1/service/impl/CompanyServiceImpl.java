package com.example.springbootdemo1.service.impl;

import com.example.springbootdemo1.entity.Permission;
import com.example.springbootdemo1.entity.User;
import com.example.springbootdemo1.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class CompanyServiceImpl implements CompanyService {

    private String param = "param";


    @Value("${provider.url}")
    private String providerUrl;

    @Value("${provider1.url1}")
    private String providerUrl1;

    @Value("${provider2.url2}")
    private String providerUrl2;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getEmpResul() {
        return restTemplate.getForObject(providerUrl, String.class);
    }

    @Override
    public String getEmpResult1() {
        return restTemplate.getForObject(providerUrl1 + "?param=ddd", String.class);
    }

    @Override
    public User getEmpResult2() {
        Permission pp = Permission.builder().id(12).name("fanbin").code("www").build();
        return restTemplate.postForObject(providerUrl2, pp, User.class, "");
    }

    @Override
    public String getResultByResilience() {
        return restTemplate.getForObject(providerUrl, String.class);
    }


}
