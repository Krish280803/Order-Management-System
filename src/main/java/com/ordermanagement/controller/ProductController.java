package com.ordermanagement.controller;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import com.ordermanagement.entity.Product;
import com.ordermanagement.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public Product saveProduct(@Valid @RequestBody Product product) {
        return service.saveProduct(product);
    }

    @GetMapping
    public Page<Product> getProducts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "name") String sortBy) {

        return service.getProducts(page, size, sortBy);
    }
}