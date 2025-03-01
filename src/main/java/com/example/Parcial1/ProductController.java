package com.example.Parcial1;

import com.example.Parcial1.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
        try{
            return new ResponseEntity<>(productService.getAllProducts(),HttpStatusCode.valueOf(200));
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
        //return productService.getAllProducts();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product>getProductById(@PathVariable int id) {
        try{
            return new ResponseEntity<>(productService.getProductById(id),HttpStatusCode.valueOf(200));
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
        //return productService.getProductById(id);
    }

    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        //return productService.addProduct(product.getNombre(), product.getPrecio());
        try{
            return new ResponseEntity<>(productService.addProduct(product.getNombre(), product.getPrecio()), HttpStatusCode.valueOf(200));
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }
}
