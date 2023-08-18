package com.fb.springbootfbtest.service;

import com.fb.springbootfbtest.entity.User;

import java.util.List;

public interface UserService {

    List<User> search(User user);
}
