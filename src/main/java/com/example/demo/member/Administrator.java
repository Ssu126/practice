package com.example.demo.member;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Administrator extends Member {
    String role;
    LocalDate allocatedAt;

    public Administrator(Integer id, String name, int age, String email, String role){
        super();
        this.role = role;
        this.allocatedAt = LocalDate.now();
    }
}