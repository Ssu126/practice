package com.example.demo1;

import com.example.demo1.member.DemoService;
import com.example.demo1.member.TaxCalculator;

public class DemoApplication {
    public static void main(String[] args){
        DemoService demoService = new DemoService();

        System.out.println(TaxCalculator.TAX_RATE);

        double kyh = TaxCalculator.calculate(1000);
        System.out.println(kyh);
        double psh = TaxCalculator.calculate(2000);
        System.out.println(psh);

        demoService.main();
    }
}
