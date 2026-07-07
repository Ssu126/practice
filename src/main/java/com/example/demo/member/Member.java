package com.example.demo.member;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Member {
    private Integer id;
    private String name;
    private int age;
    private String email;
}