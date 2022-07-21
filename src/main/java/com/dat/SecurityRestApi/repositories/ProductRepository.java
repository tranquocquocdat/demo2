package com.dat.SecurityRestApi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dat.SecurityRestApi.models.Product;

public interface ProductRepository extends CrudRepository<Product, String> {
	
	@Override
    void delete(Product deleted);
}
