package com.ordermanagement.dto;

public class OrderItemDTO {

    private Long itemId;
    private Integer quantity;
    private Long productId;

    public OrderItemDTO() {
    }

    public OrderItemDTO(Long itemId, Integer quantity, Long productId) {
        this.itemId = itemId;
        this.quantity = quantity;
        this.productId = productId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}