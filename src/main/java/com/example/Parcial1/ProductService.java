package com.example.Parcial1;

import com.example.Parcial1.Entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
class ProductService {
    private List<Product> products = new ArrayList<>();
    public List<Product> getAllProducts() {
        return products;
    }
    public Product getProductById(int id) {
        return products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
    public Product addProduct(String nombre, double precio) {
        Product product = new Product(nombre, precio);
        products.add(product);
        return product;
    }
}
