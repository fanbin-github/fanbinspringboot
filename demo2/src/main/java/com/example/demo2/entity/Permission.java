package com.example.demo2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Permission {
    private Integer id;

    private String name;

    private String code;

}
