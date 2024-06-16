package com.norcorp.ProductSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductDB db;

    // get all products from the database
    public List<Product> getAllProducts() {
        return db.findAll();
    }

    // add a product to the database
    public Product addProduct(Product p) {
        return db.save(p);
    }

    // get a particular product by his name
    public Product getProduct(String name) {
        List<Product> products = db.findAll();
        for (Product p : products) {
            if (p.getName().equals(name))
                return p;
        }
        return null;
    }




}
