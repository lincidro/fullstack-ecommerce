package com.eduardo.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.eduardo.ecommerce.entity.ProductCategory;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{
	/**
	 * collectionResourceRel  = name of JSON entry
	 * path = /products-category
	 * not the default by sprint
	 */
}
