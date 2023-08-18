package com.example.demo2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Role {

    private Integer id;

    private String code;

    private String name;

    private String sort;

    private List<Permission> permissions;

}
