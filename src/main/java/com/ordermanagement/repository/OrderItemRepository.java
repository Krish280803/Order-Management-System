package com.ordermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ordermanagement.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}