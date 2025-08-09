package com.debu.Ecom_proj.service;

import com.debu.Ecom_proj.model.Product;
import com.debu.Ecom_proj.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    public List<Product> getAllProduct() {
//        return repo.findAll();
//    }

//    public void addProduct(Product newProduct) {
//        repo.save(newProduct);
//    }

//    public Product getProductById(int prodId) {
//        return repo.findById(prodId)
//                .orElseThrow(() -> new RuntimeException("Product not found with id: " + prodId));
//    }
//
//    public void deleteProductById(int prodId) {
//        if(!repo.existsById(prodId)) {
//            throw new RuntimeException("Product not found with id: " + prodId);
//        }
//        repo.deleteById(prodId);
//    }
//
//
//    public void updatedProduct(Product updateProduct) {
//        if(!repo.existsById(updateProduct.getProdId())) {
//            throw new RuntimeException("Product not found with id: " + updateProduct.getProdId());
//        }
//        repo.save(updateProduct);
//    }
//    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
//        product.setImageName(imageFile.getOriginalFilename());
//        product.setImageType(imageFile.getContentType());
//        product.setImageData(imageFile.getBytes());
//
//        return repo.save(product);
//    }


    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProduct(int id) {
        return repo.findById(id).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());

        return repo.save(product);
    }

    public Product updateProduct(int productId,
                                 Product product, MultipartFile imageFile) throws IOException {
        product.setImageData(imageFile.getBytes());
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        return repo.save(product);
    }

    public void deleteProductById(int prodId) {
        if (!repo.existsById(prodId)) {
            throw new RuntimeException("Product not found with id: " + prodId);
        }
        repo.deleteById(prodId);
    }


    public List<Product> searchProduct(String keyword) {
        return repo.searchProduct(keyword);
    }
}
