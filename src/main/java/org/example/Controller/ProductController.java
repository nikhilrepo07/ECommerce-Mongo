package org.example.Controller;

import org.example.Model.Product;
import org.example.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class ProductController {

    @Autowired
    ProductService productService;
    @PostMapping("/addproduct")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping("/getallproducts")
    public List<Product> getProducts(){
        return productService.getAllProducts();
    }

}
