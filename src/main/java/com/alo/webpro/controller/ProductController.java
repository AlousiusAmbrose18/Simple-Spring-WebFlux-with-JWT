package com.alo.webpro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.alo.webpro.entity.Brand;
import com.alo.webpro.entity.Products;
import com.alo.webpro.service.ProductService;

import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/products/")
public class ProductController {

    @Autowired
    private ProductService service;
 

    @GetMapping("/home")
    public String welcome() {
        return "Welcome";
    }

    @GetMapping("/allProducts")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public List<Products> getAllProducts() {
        return service.getProducts();
    }
    
    @GetMapping("/allBrands")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Flux<Brand> getAllBrands() {
        return service.getBrands();
    }


}
