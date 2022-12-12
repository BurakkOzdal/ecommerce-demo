package com.etiya.ecommercedemo4.repository;

import com.etiya.ecommercedemo4.business.dtos.response.city.GetAllCitiesResponse;
import com.etiya.ecommercedemo4.entities.concretes.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICityRepository extends JpaRepository<City,Integer> {

    @Query("select new com.etiya.ecommercedemo4.business.dtos.response.city.GetAllCitiesResponse" +
            "(c.id,c.name,co.name) from City c inner join c.country co")
    List<GetAllCitiesResponse> getAllDto();



}
