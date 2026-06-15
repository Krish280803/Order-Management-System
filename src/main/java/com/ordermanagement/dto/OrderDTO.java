package com.ordermanagement.dto;

import java.time.LocalDate;

public class OrderDTO {

    private Long orderId;
    private LocalDate orderDate;
    private Long customerId;

    public OrderDTO() {
    }

    public OrderDTO(Long orderId, LocalDate orderDate, Long customerId) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.customerId = customerId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}