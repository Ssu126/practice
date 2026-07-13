package com.example.demo;

public class MakingSinRamen extends MakingRamen{
    @Override
    protected String water(){
        return "생수";
    }
    @Override
    protected String soup(){
        return "신라면";
    }
    @Override
    protected String noodle(){
        return "건면";
    }
}
