package com.fb.springbootfbtest.dao;

import com.fb.springbootfbtest.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpDepDao {
    List<Employee> searchEmp();
}
