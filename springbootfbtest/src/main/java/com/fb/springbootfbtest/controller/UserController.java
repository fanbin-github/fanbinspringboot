package com.fb.springbootfbtest.controller;

import com.fb.springbootfbtest.entity.Permission;
import com.fb.springbootfbtest.entity.User;
import com.fb.springbootfbtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("te")
public class UserController {
    @Value("${myname}")
    private String myname;
    @Autowired
    UserService userService;

    @RequestMapping("testconsul")
    @ResponseBody
    public String test() {
        return "fuck!";
    }

    @RequestMapping("testconsul1")
    @ResponseBody
    public String test1(@RequestParam("param") String parama) {
        return "fuck!" + parama;
    }

    @PostMapping(value = "testconsul2")
    @ResponseBody
    public User test2(@RequestBody Permission p) {
        return User.builder().id(p.getId()).username(p.getName()).password(p.getCode()).build();
    }

    @RequestMapping(value = "getUserList")
    @ResponseBody
    public List<User> getUserList(@RequestBody User uu) {
        return userService.search(uu);
    }

    @RequestMapping(value = "hh")
    public void hh() {
    }

    @RequestMapping(value = "h")
    public void h() {
        System.out.println("hahahahahaqweqwe");
    }

    @RequestMapping("getUser")
    @ResponseBody
    public List<User> searchUser(@RequestBody User user) {
        //User user1=User.builder().id(1).username("fanbin").password("wx3424587575").build();
        return userService.search(user);
    }

    @RequestMapping(value = "getmyname")
    @ResponseBody
    public String getString() {
        return myname;
    }


}
