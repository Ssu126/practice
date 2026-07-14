package com.example.demo.Service;

import com.example.demo.Order.OrderRepository;
import com.example.demo.Order.Order;

public class DeliveryService {
    private final OrderRepository orderRepository;

    public Order departed(Integer orderId){
        Order retrieved = orderRepository.retrieve(orderId);
        retrieved.departed();
        return orderRepository.update(retrieved);
    }
    public Order Arrived(Integer orderId){
        Order retrieved = orderRepository.retrieve(orderId);
        retrieved.arrived();
        return orderRepository.update(retrieved);
    }
}
