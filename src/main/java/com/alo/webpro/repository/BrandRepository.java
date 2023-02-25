package com.alo.webpro.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.alo.webpro.entity.Brand;

@Repository
public interface BrandRepository extends ReactiveMongoRepository<Brand, Long> {

}
