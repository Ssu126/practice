package com.Add_Practice2_1;

public class MemberResponseDTO {
    private Integer id;
    private String name;
    private Integer age;
    private String email;

    public MemberResponseDTO(Integer id, String name, Integer age, String email){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }
    @Override
    public String toString(){
        return String.format("MemberResponseDTO(id=%d, name=%s, age=%d, email=%s",
                id, name, age, email);
    }
}
