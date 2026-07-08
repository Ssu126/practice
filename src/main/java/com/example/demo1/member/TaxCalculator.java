package com.example.demo1.member;

import lombok.Getter;

@Getter
public class TaxCalculator {
    public static final double TAX_RATE = 0.11;
    public static double calculate(int originalPrice){
        return TAX_RATE * originalPrice;
    }
}
