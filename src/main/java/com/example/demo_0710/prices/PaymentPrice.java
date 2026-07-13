package com.example.demo_0710.prices;

public class PaymentPrice extends OriginalPrice{
    private final static double TAX_RATE = 1.1;
    private int deliveryPrice;

    public PaymentPrice(String name, int price, int deliveryPrice){
        super(name, price);
        this.deliveryPrice = deliveryPrice;
    }

    @Override
    public void display(){
        System.out.println(
                String.format("상품(%s)의 가격은 %s입니다.", super.name, (int)(super.price * TAX_RATE + this.deliveryPrice))
        );
    }
}
