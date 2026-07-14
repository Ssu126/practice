package com.example.demo.Service;

import com.example.demo.Order.Order;
import com.example.demo.Order.OrderRepository;

public class OrderService {
    private final OrderRepository orderRepository;

    public Order create(String product){
        return orderRepository.create(product);
    }
}
