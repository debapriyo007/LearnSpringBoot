package com.debu.simpleWebApp.controllers;

import com.debu.simpleWebApp.model.Product;
import com.debu.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/get-products")
    public List<Product> getProduct(){
        return productService.getProducts();
    }

    @GetMapping("/get-product/{prodId}")
    public Product getProductById(@PathVariable  int prodId){
        return productService.getProductById(prodId);
    }

    @PostMapping("/add-product")
    public void addProduct(@RequestBody Product newProduct){
//        System.out.println(newProduct);
        productService.addProduct(newProduct);
    }


    @PutMapping("/update-product")
    public void updateProduct(@RequestBody  Product product){
        productService.updateProduct(product);
    }

    @DeleteMapping("/delete-product/{prodId}")
    public void deleteByProductId(@PathVariable  int prodId){
        productService.deleteByProdId(prodId);
    }
}
