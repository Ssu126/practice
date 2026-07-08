package com.example.demo.member;

import lombok.Builder;
import lombok.Singular;

import java.util.List;

@Builder
public class Member {
    protected Integer id;
    @Builder.Default
    protected String name = "Unnamed";
    protected int age;
    @Builder.Default
    protected String email = "Undefined";
    @Singular
    protected List<String> favorites;

    public static class MemberBuilder{
        public MemberBuilder age(int age){
            if (age >= 30){
                throw new RuntimeException("30세 이상은 설정 불가능합니다.");
                this.age = age;
                return this;
            }
        }
    }

    public String toString(){
        return String.format("Member(id=%s, name=%s, " +
                "age=%s, email=%s, favorites=%s", id, name, age, email, favorites);
    }

    public String getName(){
        return this.name;
    }
}