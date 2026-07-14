package com.example.demo.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderRepository {
    private static final Map<Integer, Order> ORDERS = new HashMap<>();

    public Order create(String product){
        Order created = new Order(product);
        ORDERS.put(created.getId(), created);
        return created;
    }

    public Order retrieve(Integer orderId){
        if(!ORDERS.containsKey(orderId)){
            throw new RuntimeException("조회하려는 구매 정보가 없습니다");
        }
        return ORDERS.get(orderId);
    }

    public Order update(Order updated){
        if(!ORDERS.containsKey(updated.getId()){
            throw new RuntimeException("업데이트하려는 구매 정보가 없습니다");
        }
        ORDERS.replace(updated.getId(), updated);
        return updated;
    }

}
