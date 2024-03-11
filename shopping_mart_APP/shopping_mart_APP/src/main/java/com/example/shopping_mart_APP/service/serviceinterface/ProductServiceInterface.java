package com.example.shopping_mart_APP.service.serviceinterface;

import com.example.shopping_mart_APP.model.Product;

import java.util.List;

public interface ProductServiceInterface {
    List<Product> DisplayProducts();

    Product saveProduct(Product product);
}
