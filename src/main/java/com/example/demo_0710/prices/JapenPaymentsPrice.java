package com.example.demo_0710.prices;

public class JapenPaymentsPrice extends OriginalPrice{
    private final static double TAX_RATE = 1.5;
    private int deliveryPrice;

    public JapenPaymentsPrice(String name, int price, int deliveryPrice){
        super(name, price);
        this.deliveryPrice = deliveryPrice;
    }

    @Override
    public void display(){
        System.out.println(
                String.format("일본에서 구매하는 상품(%s)의 가격은 %s 입니다.",
                        super.name, (int)(super.price * TAX_RATE + this.deliveryPrice))
        );
    }
}
