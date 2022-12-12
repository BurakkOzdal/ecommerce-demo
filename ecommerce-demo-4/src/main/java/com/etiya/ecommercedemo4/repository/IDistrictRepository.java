package com.etiya.ecommercedemo4.repository;

import com.etiya.ecommercedemo4.entities.concretes.District;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDistrictRepository extends JpaRepository<District,Integer> {

}
