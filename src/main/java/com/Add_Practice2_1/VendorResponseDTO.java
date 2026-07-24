package com.Add_Practice2_1;

public class VendorResponseDTO {
    private Integer id;
    private String name;
    private Integer age;
    private String email;
    private String address;
    private String category;

    public VendorResponseDTO(Integer id, String name, Integer age, String email, String address, String category){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
        this.category = category;
    }

    @Override
    public String toString(){
        return String.format("VendorResponseDTO(id=%d, name=%s, age=%d, email=%s, address=%s, category=%s)",
                id, name, age, email, address, category);
    }
}
