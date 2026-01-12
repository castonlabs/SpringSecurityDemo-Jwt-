package com.zyratechnologies.jwtproject1.controller;

import com.zyratechnologies.jwtproject1.model.Product;
import com.zyratechnologies.jwtproject1.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping("/all")
    public ResponseEntity<?> getAllProducts() {
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable long id) {
        return ResponseEntity.ok(productService.findById(id));
    }

    @PreAuthorize("hasRole('Admin')")
    @PostMapping("/save")
    public ResponseEntity<?> saveProduct(Product product) {
        return ResponseEntity.ok(productService.save(product));
    }

}
