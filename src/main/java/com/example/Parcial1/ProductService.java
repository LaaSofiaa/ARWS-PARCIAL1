package com.example.Parcial1;

import com.example.Parcial1.Entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
class ProductService {
    private List<Product> products = new ArrayList<>();
    public List<Product> getAllProducts() {
        if(!products.isEmpty()){
            return products;
        }else{
            return null;
        }
    }
    public Product getProductById(int id) {
        if(id != 0){
            return products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);}
        else{
            return null;
        }
    }
    public Product addProduct(String nombre, double precio) {
        Product product = new Product(nombre, precio);
        products.add(product);
        return product;
    }
}
