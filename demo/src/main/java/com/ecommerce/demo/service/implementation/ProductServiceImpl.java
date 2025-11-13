package com.ecommerce.demo.service.implementation;

import com.ecommerce.demo.entity.Product;
import com.ecommerce.demo.repository.ProductRepository;
import com.ecommerce.demo.service.Interface.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> GetAll() {
        return productRepository.findAll();
    }
}
