package com.fb.springbootfbtest;

import com.fb.springbootfbtest.entity.User;

import java.lang.reflect.Constructor;

public class TestReflect {
    public static void main(String[] args) {


        Class userClass = User.class;

        System.out.println(userClass.getSuperclass());

        Constructor<User>[] dconstructors = userClass.getDeclaredConstructors();
        for (int i = 0; i < dconstructors.length; i++) {
            System.out.println("我是所有构造器" + (i + 1) + " = " + dconstructors[i]);
        }


    }
}
