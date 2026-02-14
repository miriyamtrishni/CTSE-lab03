package com.sliit.product_service.api;

import com.sliit.product_service.model.Product;
import com.sliit.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("v1/api/products")
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private final ProductService productService;

    @PostMapping
    public boolean createProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAll();
    }

    @GetMapping("/getById")
    public Product getProductById(@RequestParam Long id) {
        return productService.getProductById(id);
    }

    @DeleteMapping
    public boolean deleteProductById(@RequestParam Long id) {
        return productService.deleteProductById(id);
    }
}