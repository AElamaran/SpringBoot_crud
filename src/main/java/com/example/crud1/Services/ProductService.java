package com.example.crud1.Services;

import com.example.crud1.Model.Product;
import com.example.crud1.Repository.ProdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProdRepo repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductsById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void updateProducts(Product prod) {
        repo.save(prod);
    }

    public void addProducts(Product prod) {
        repo.save(prod);
    }

    public void deleteproduct( int prodId) {
        repo.deleteById(prodId);
    }
}
