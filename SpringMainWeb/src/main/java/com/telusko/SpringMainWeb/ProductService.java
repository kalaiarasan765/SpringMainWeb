package com.telusko.SpringMainWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    @Autowired
    ProductDB db;
    public ProductService(){}
    public List<Product> getAllProducts(){
        return this.db.findAll();
    }

    public Product getProduct(String name) {
        return  db.findByName(name);


    }


    public void addProduct(Product p) {
        db.save(p);
    }
}
