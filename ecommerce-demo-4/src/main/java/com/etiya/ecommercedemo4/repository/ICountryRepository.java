package com.etiya.ecommercedemo4.repository;

import com.etiya.ecommercedemo4.entities.concretes.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICountryRepository extends JpaRepository<Country,Integer> {

    Country findByName(String name);
    // Ülkeleri harflerine göre sırala
    @Query("Select c from Country as c ORDER BY c.name DESC")
    List<Country> findAllCountriesOrderByName();

}
