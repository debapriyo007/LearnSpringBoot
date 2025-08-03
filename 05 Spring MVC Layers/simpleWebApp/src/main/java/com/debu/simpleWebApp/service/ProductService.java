package com.debu.simpleWebApp.service;

import com.debu.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product>products = Arrays.asList (
            new Product(101, "MacBook Air", 100000),
            new Product(102, "Hp Envy", 80000),
            new Product(103, "Dell Inspiron", 60000)
    );

    public List<Product>getProducts(){
        return products;
    }
}
