package com.sliit.product_service.service.impl;

import com.sliit.product_service.model.Product;
import com.sliit.product_service.repository.ProductRepository;
import com.sliit.product_service.service.ProductService;
import io.swagger.v3.oas.annotations.servers.Server;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private final ProductRepository productRepository;
    @Override
    public boolean saveProduct(Product product) {
        productRepository.save(product);
        return true;

    }

    @Override
    public List<Product> getAll() {
        List<Product> all = productRepository.findAll();
        return all;
    }

    @Override
    public Product getProductById(Long id) {
       return productRepository.getProductById(id);
    }

    @Override
    public boolean deleteProductById(Long id) {
        productRepository.deleteById(id);
        return false;
    }

    public boolean updateProduct(Product product) {
        Optional<Product> byId = productRepository.findById(product.getId());
        if(byId.isPresent()) {
            byId.get().setName(product.getName());
            byId.get().setPrice(product.getPrice());

            productRepository.save(byId.get());
            return true;
        }
        return false;
    }
}
