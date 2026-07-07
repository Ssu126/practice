package com.example.demo.member;

import lombok.*;

@Getter
@ToString(onlyExplicitlyIncluded = true, includeFieldNames = false)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Member {
    @ToString.Include(name = "memberId")
    private Integer id;
    @ToString.Include(rank = -1)
    private String name;
    @Setter(AccessLevel.PRIVATE)
    private int age;
    @Setter
    private String email;
}