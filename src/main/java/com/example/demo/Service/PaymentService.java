package com.example.demo.Service;

import com.example.demo.Order.OrderRepository;
import com.example.demo.Order.Order;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PaymentService {
    private final OrderRepository orderRepository;

    public Order payment(Integer orderId, String method){
        Order order = orderRepository.retrieve(orderId);
        order.pay(method);
        return orderRepository.update(order);
    }
}
