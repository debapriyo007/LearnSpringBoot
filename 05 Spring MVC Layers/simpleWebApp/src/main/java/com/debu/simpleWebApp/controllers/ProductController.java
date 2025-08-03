package com.debu.simpleWebApp.controllers;

import com.debu.simpleWebApp.model.Product;
import com.debu.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/get-products")
    public List<Product> getProduct(){
        return productService.getProducts();
    }

}
