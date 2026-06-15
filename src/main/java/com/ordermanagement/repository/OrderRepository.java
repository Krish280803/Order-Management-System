package com.ordermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ordermanagement.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {
}