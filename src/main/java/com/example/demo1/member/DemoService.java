package com.example.demo1.member;

public class DemoService {
    public void main(){
        double kyh = TaxCalculator.calculate(1000);
        System.out.println(kyh);

        double psh = TaxCalculator.calculate(2000);
        System.out.println(psh);
    }
}
