package com.example.demo.member;

import lombok.*;

@Getter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Member {
    private Integer id;
    private String name;
    @Setter(AccessLevel.PRIVATE)
    private int age;
    @Setter
    private String email;

    public String toString(){
        return String.format("Member(id=%s, name=%s, age=%s, email=%s)", id, name, age, email);
    }
}