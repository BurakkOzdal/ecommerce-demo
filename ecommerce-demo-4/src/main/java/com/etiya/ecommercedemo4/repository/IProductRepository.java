package com.etiya.ecommercedemo4.repository;

import com.etiya.ecommercedemo4.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product,Integer> {

    //stock sayısına göre stock alanı gelen int değerden fazla olan productlar.
    List<Product> findAllProductsByStockGreaterThanOrderByStockDesc(int stock);
   //:parametre adı
    @Query("Select p from Product as p WHERE name = :name")
    Product findByName(String name);
   // @Query("SELECT p FROM Product p WHERE p.unitPrice BETWEEN ?1 AND ?2")
    @Query("SELECT p FROM Product p WHERE p.unitPrice BETWEEN :start and :end")
    List<Product> findAllProductsUnitPriceBetween(double start, double end);




}
