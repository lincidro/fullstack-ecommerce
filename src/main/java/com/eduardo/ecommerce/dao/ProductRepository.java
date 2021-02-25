package com.eduardo.ecommerce.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardo.ecommerce.entity.Product;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long>{

    /**
     * select * from product where category_id=?
     * @param id, id to find on db
     * @param pageable, is pageable
     * @return
     */
    Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);
}
