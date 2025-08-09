package com.debu.Ecom_proj.controller;


import com.debu.Ecom_proj.model.Product;
import com.debu.Ecom_proj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin

public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/")
    public String greet(){
        return "hi ! Debu it's me Spring Boot";
    }

//    @GetMapping("/all-product")
//    public ResponseEntity<List<Product>> getAllProduct(){
//
//        List<Product> productList = service.getAllProduct();
//        if(productList.isEmpty()){
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<>(productList, HttpStatus.OK);
//    }


//    @PostMapping("/add-product")
//    public void addProduct(@RequestBody Product newProduct) {
////        System.out.println(newProduct);
////        service.addProduct(newProduct);
//
//    }

//    @GetMapping("/product/{prodId}")
//    public ResponseEntity<Product> getProductById(@PathVariable  int prodId){
//        return new ResponseEntity<>(service.getProductById(prodId), HttpStatus.OK);
//    }
//
//    @DeleteMapping("/delete-product/{prodId}")
//    public void deleteProductById(@PathVariable int prodId) {
//        service.deleteProductById(prodId);
//    }
//
//    @PutMapping("/update-product")
//    public void updateProduct(@RequestBody Product updateProduct){
//        service.updatedProduct(updateProduct);
//    }
//
//
//    @PostMapping("/product")
//    public ResponseEntity<?> addProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile) {
//        try {
//            Product product1 = service.addProduct(product, imageFile);
//            return new ResponseEntity<>(product1, HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//
//
//        }
//    }




    //############ API'S FOR TESTING ##############


    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {

        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id) {
        Product product = service.getProduct(id);
        if (product != null) {
            return new ResponseEntity<>(product, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile) {
        try {
            Product product1 = service.addProduct(product, imageFile);
            return new ResponseEntity<>(product1, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);


        }
    }


    @GetMapping("/product/{productId}/image")
    public ResponseEntity<byte[]>getImageByProdId(@PathVariable int productId) {

        Product product = service.getProduct(productId);
        byte[] imageFile = product.getImageData();

        if(imageFile != null){
            return ResponseEntity.ok()
                    .contentType(MediaType.valueOf(product.getImageType()))
                    .body(imageFile);
        } else {
            return ResponseEntity.notFound().build();
        }

    }


    @PutMapping("/product/{productId}")
    public ResponseEntity<String>updateProduct(@PathVariable int productId,
                                               @RequestPart Product product,
                                               @RequestPart MultipartFile imageFile){

        Product updatedProduct = null;
        try{
            updatedProduct = service.updateProduct(productId, product, imageFile);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(updatedProduct != null){
            return new ResponseEntity<>("Product updated successfully", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Failed to Updated", HttpStatus.BAD_REQUEST);
        }
    }


    @DeleteMapping("/product/{prodId}")
    public ResponseEntity<String>deleteProduct(@PathVariable int prodId){
        Product product = service.getProduct(prodId);
        if(product != null){
            service.deleteProductById(prodId);
            return new ResponseEntity<>("Product deleted successfully", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
        }
    }



    @GetMapping("/products/search")
    public ResponseEntity<List<Product>>searchProduct(String keyword){

        System.out.println("Searching with ... " + keyword);
        List<Product> product = service.searchProduct(keyword);
        if(product.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(product, HttpStatus.OK);

    }

}
