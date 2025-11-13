package com.ecommerce.demo.service.implementation;

import com.ecommerce.demo.entity.Product;
import com.ecommerce.demo.repository.ProductRepository;
import com.ecommerce.demo.service.Interface.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> GetAll() {
        List<Product> products = productRepository.findAll();
        return products;
    }
}
