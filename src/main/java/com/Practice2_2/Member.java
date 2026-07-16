package com.Practice2_2;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    Integer id;
    String name;
    Integer age;
    String email;
}
