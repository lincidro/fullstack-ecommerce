package com.eduardo.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
