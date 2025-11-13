package com.ecommerce.demo.controller;

import com.ecommerce.demo.entity.Product;
import com.ecommerce.demo.service.Interface.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public List<Product> getAllProducts(){
        return productService.GetAll();
    }
}
