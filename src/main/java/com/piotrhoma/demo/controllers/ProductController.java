package com.piotrhoma.demo.controllers;

import com.piotrhoma.demo.models.Product;
import com.piotrhoma.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    // List all products
    @GetMapping
    public List<Product> list() {
        return productRepository.findAll();
    }
    // Create product
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Product product){
        productRepository.save(product);
    }
    // Show specific product
    @GetMapping("/{id}")
    public Product get(@PathVariable("id") long id){
        return productRepository.getOne(id);
    }
}
