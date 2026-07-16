package com.Practice1_1;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@ToString
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Member extends MemberRepository{
        String id;
        String name;
        Integer age;
        String email;

        public Member(String id, String name, Integer age, String email){
            this.id = id;
            this.name = name;
            this.age = age;
            this.email = email;
    }
}
