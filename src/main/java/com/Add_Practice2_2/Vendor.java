package com.Add_Practice2_2;

public class Vendor extends Human{
    private Integer age;
    private String email;
    private String address;
    private String category;

    public Vendor(String name, Integer age, String email, String address, String category){
        super(name);
        this.age = age;
        this.email = email;
        this.address = address;
        this.category = category;
    }
}
