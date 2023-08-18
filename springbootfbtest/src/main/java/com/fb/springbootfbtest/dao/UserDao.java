package com.fb.springbootfbtest.dao;

import com.fb.springbootfbtest.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    List<User> searchuser(User user);
}
