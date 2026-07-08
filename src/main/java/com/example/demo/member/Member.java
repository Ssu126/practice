package com.example.demo.member;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;

@Value
@NonFinal
public class Member {
    Integer id;
    String name;
    int age;
    String email;
}