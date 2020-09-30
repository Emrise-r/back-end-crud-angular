package com.xyz.crudangularproduct.repository;

import com.xyz.crudangularproduct.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
