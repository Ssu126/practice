package com.example.demo.Service;

import com.example.demo.Order.Order;
import com.example.demo.Order.OrderRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public Order create(String product){
        return orderRepository.create(product);
    }
}
