package com.example.demo.member;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.logging.Level;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true, includeFieldNames = false)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Member {
    @ToString.Include(name = "memberId")
    @EqualsAndHashCode.Include
    Integer id;
    @ToString.Include(rank = -1)
    @EqualsAndHashCode.Include
    String name;
    String email;
    int age;

    /*
    public boolean equals(Member member){
        return this.hashCode() == member.hashCode();
    }

    public int hashCode(){
        int hash = 7;
        hash = 31 * hash + (id == null ? 0 : id.hashCode());
        hash = 31 * hash + (name == null ? 0 : name.hashCode());
        hash = 31 * hash + (int) age;
        hash = 31 * hash + (email == null ? 0 : email.hashCode());
        return hash;
    }
    */
}