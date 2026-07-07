package com.example.demo.member;

import lombok.*;

@Getter
@ToString
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Member {
    private Integer id;
    private String name;
    @Setter(AccessLevel.PRIVATE)
    @ToString.Exclude
    private int age;
    @Setter
    @ToString.Exclude
    private String email;
}