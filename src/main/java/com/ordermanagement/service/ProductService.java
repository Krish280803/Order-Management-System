package com.ordermanagement.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ordermanagement.entity.Product;
import com.ordermanagement.exception.ResourceNotFoundException;
import com.ordermanagement.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    // Save Product
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    // Get All Products with Pagination & Sorting
    public Page<Product> getProducts(int page, int size, String sortBy) {

        Pageable pageable = PageRequest.of(
                page,
                size,
                Sort.by(sortBy).ascending());

        return repository.findAll(pageable);
    }

    // Get Product By Id
    public Product getProductById(Long id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Product not found with id: " + id));
    }

    // Delete Product
    public void deleteProduct(Long id) {

        Product product = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Product not found with id: " + id));

        repository.delete(product);
    }
}