package com.example.demo.member;


import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@RequiredArgsConstructor
public class Member {
    private Integer id;
    private String name;
    private int age;
    private String email;
}