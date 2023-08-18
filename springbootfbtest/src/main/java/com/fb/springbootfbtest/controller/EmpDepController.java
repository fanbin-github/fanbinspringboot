package com.fb.springbootfbtest.controller;


import com.fb.springbootfbtest.entity.Employee;
import com.fb.springbootfbtest.service.EmpDepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "empdep")
public class EmpDepController {
    @Autowired
    private EmpDepService empDepService;

    @RequestMapping(value = "getEmp")
    public List<Employee> getAllEmp() {
        return empDepService.searchAllEmp();
    }
}
