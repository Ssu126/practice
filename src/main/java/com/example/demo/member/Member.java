package com.example.demo.member;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Member {
    private Integer id;
    private String name;
    private int age;
    private String email;
}