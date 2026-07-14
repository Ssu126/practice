package com.example.demo;

import com.example.demo.Order.OrderController;
import com.example.demo.Order.OrderRepository;
import com.example.demo.Service.OrderService;
import com.example.demo.Service.DeliveryService;
import com.example.demo.Service.PaymentService;

public final class DemoApplication {
    OrderController orderController = new OrderController(
            new OrderService(new OrderRepository()),
            new PaymentService(new OrderRepository()),
            new DeliveryService(new OrderRepository())
    );
    orderController.process();
}