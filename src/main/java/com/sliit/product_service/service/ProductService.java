package com.sliit.product_service.service;

import com.sliit.product_service.model.Product;

import java.util.List;

public interface ProductService {

    boolean saveProduct(Product product);

    List<Product> getAll();

    Product getProductById(Long id);

    boolean deleteProductById(Long id);
}
