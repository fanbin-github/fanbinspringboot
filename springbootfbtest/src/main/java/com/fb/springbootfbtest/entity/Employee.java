package com.fb.springbootfbtest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;

    private Integer age;

    private String gender;

    private String name;

    private Integer number;

    private Department dep;

}
