package com.etiya.ecommercedemo4.repository;

import com.etiya.ecommercedemo4.entities.concretes.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISupplierRepository extends JpaRepository<Supplier,Integer> {
}
