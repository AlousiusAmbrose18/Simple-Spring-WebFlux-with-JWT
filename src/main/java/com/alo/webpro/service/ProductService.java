package com.alo.webpro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alo.webpro.entity.Brand;
import com.alo.webpro.entity.Products;
import com.alo.webpro.repository.BrandRepository;
import com.alo.webpro.repository.ProductRepository;

import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private BrandRepository brandRepository;


    public List<Products> getProducts() {
        return productRepository.findAll();
    }
    
    public Flux<Brand> getBrands() {
        return brandRepository.findAll().switchIfEmpty(Flux.empty());
    }
}
