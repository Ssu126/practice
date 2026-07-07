package com.example.demo.member;

import lombok.*;

@Getter
@ToString(onlyExplicitlyIncluded = true)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Member {
    @ToString.Include
    private Integer id;
    @ToString.Include
    private String name;
    @Setter(AccessLevel.PRIVATE)
    private int age;
    @Setter
    private String email;
}