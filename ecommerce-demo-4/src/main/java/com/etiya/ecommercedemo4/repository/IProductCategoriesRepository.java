package com.etiya.ecommercedemo4.repository;

import com.etiya.ecommercedemo4.entities.concretes.ProductCategories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductCategoriesRepository extends JpaRepository<ProductCategories,Integer> {


}
