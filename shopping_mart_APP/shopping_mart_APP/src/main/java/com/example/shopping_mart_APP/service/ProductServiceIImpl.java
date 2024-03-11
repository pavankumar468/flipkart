package com.example.shopping_mart_APP.service;

import com.example.shopping_mart_APP.model.Product;
import com.example.shopping_mart_APP.repository.ProductRepository;
import com.example.shopping_mart_APP.service.serviceinterface.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceIImpl implements ProductServiceInterface {
    @Autowired
    private ProductRepository productRepo;
    @Override
    public List<Product> DisplayProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }
}
