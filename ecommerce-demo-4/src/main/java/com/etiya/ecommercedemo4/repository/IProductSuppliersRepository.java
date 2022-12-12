package com.etiya.ecommercedemo4.repository;

import com.etiya.ecommercedemo4.entities.concretes.ProductSuppliers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductSuppliersRepository extends JpaRepository<ProductSuppliers,Integer> {
}
