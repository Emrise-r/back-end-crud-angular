package com.xyz.crudangularproduct.service.product;

import com.xyz.crudangularproduct.model.Product;

public interface ProductService {
    Iterable<Product> findAll();

    Product findByProductId(Long id);

    void save(Product product);

    void remove(Long id);

}
