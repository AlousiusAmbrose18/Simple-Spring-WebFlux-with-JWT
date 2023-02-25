package com.alo.webpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alo.webpro.entity.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Long>{

}
