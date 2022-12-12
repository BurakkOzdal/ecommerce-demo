package com.etiya.ecommercedemo4.repository;

import com.etiya.ecommercedemo4.entities.concretes.Street;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStreetRepository extends JpaRepository<Street,Integer> {

}
