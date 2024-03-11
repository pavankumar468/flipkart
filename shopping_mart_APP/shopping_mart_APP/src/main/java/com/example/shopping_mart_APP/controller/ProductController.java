package com.example.shopping_mart_APP.controller;

import com.example.shopping_mart_APP.model.Product;
import com.example.shopping_mart_APP.service.serviceinterface.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class ProductController {
    @Autowired
    private ProductServiceInterface productService;
    @PostMapping("Products/saveproduct")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
   @GetMapping("/product/fetchAllProducts")
    public List<Product> DisplayProducts(){
       return productService.DisplayProducts();
   }
}
