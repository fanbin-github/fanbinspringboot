package com.fb.springbootfbtest.service.impl;

import com.fb.springbootfbtest.dao.EmpDepDao;
import com.fb.springbootfbtest.entity.Employee;
import com.fb.springbootfbtest.service.EmpDepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpDepServiceImpl implements EmpDepService {

    @Autowired
    private EmpDepDao empDepDao;

    @Override
    public List<Employee> searchAllEmp() {
        return empDepDao.searchEmp();
    }
}
