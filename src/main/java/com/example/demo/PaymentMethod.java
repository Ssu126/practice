package com.example.demo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum PaymentMethod {
    CARD("카드 결제", 0.00),
    CASH("현금 결제", 0.02),
    BANK("통장 입금," 0.01);

    String method;
    Double discount;

    public static PaymentMethod from(String method){

    }
}
