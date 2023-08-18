package com.fb.springbootfbtest.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private Integer id;

    private String depName;

    private Integer depNumber;
}
