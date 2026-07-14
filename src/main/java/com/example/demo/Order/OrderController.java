package com.example.demo.Order;

import com.example.demo.Service.DeliveryService;
import com.example.demo.Service.OrderService;
import com.example.demo.Service.PaymentService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    private final PaymentService paymentService;
    private final DeliveryService deliveryService;

    public void process(){
        String product = "McBook Pro";
        Order order = orderService.create(product);
        Integer orderId = order.getId();

        String method = "CARD";
        paymentService.payment(orderId, method);

        deliveryService.departed(orderId);
        deliveryService.arrived(orderId);
    }
}
