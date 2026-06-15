package com.ordermanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ordermanagement.entity.Orders;
import com.ordermanagement.repository.OrderRepository;

@Service
public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public Orders saveOrder(Orders order) {
        return repository.save(order);
    }

    public List<Orders> saveOrders(List<Orders> orders) {
        return repository.saveAll(orders);
    }

    public List<Orders> getAllOrders() {
        return repository.findAll();
    }
}