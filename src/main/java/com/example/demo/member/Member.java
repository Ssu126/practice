package com.example.demo.member;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Member {
    Integer id;
    String name;
    int age;
    String email;
}