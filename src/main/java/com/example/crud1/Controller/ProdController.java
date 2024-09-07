package com.example.crud1.Controller;


import com.example.crud1.Model.Product;
import com.example.crud1.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdController {
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();


    }
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
       return service.getProductsById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        service.addProducts(prod);

    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        service.updateProducts(prod);

    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProducts(@PathVariable int prodId){
        service.deleteproduct(prodId);

    }

}
