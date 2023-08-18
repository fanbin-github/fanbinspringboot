package com.example.demo2.feign;

import com.example.demo2.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "consul-fb-provider")
public interface UserServiceFeign {

    @RequestMapping("/fbdev/te/getUserList")
    List<User> getUserList(@RequestBody User user);

}
