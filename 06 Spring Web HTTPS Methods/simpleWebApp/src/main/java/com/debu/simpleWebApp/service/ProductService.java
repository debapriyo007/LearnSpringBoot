package com.debu.simpleWebApp.service;

import com.debu.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product>products = new ArrayList<>(Arrays.asList (
            new Product(101, "MacBook Air", 100000),
            new Product(102, "Hp Envy", 80000),
            new Product(103, "Dell Inspiron", 60000)
    ));

    public List<Product>getProducts(){
        return products;
    }

    public Product getProductById(int prodId){
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().orElse(null);
    }

    public void addProduct(Product newProduct){
        products.add(newProduct);
    }



    public void updateProduct(Product prod) {
        int index = 0;
        for(int i = 0;i<products.size();i++){
            if(products.get(i).getProdId() == prod.getProdId()){
                index = i;
                break;
            }
        }
        products.set(index,prod);
    }


    public void deleteByProdId(int prodId){
        int index = 0;
        for(int i = 0;i<products.size();i++){
            if(products.get(i).getProdId() == prodId){
                index = i;
                break;
            }
        }
        products.remove(index);
    }
}
