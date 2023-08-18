package com.fb.springbootfbtest.service.impl;

import com.fb.springbootfbtest.dao.UserDao;
import com.fb.springbootfbtest.entity.User;
import com.fb.springbootfbtest.service.UserService;
import com.fb.springbootfbtest.util.TestAop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    @TestAop
    public List<User> search(User user) {
        return userDao.searchuser(user);
    }
}
