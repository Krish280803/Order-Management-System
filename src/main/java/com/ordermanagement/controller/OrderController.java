package com.ordermanagement.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.ordermanagement.entity.Orders;
import com.ordermanagement.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    // Save Single Order
    @PostMapping
    public Orders createOrder(@RequestBody Orders order) {
        return service.saveOrder(order);
    }

    // Save Multiple Orders
    @PostMapping("/bulk")
    public List<Orders> createOrders(@RequestBody List<Orders> orders) {
        return service.saveOrders(orders);
    }

    // Get All Orders
    @GetMapping
    public List<Orders> getOrders() {
        return service.getAllOrders();
    }
}