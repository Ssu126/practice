package com.example.demo_0710.prices;

public final class DemoApplication {
    public static void main(String[] args){
        String name = "하리보 젤리";
        int price = 2500;
        int deliveryPrice = 2500;

        OriginalPrice parent = new JapenPaymentsPrice(name, price, deliveryPrice);
        parent.display();
    }
}
