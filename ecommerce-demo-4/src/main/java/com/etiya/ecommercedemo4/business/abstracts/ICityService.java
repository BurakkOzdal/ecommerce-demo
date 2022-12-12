package com.etiya.ecommercedemo4.business.abstracts;

import com.etiya.ecommercedemo4.business.dtos.request.city.AddCityRequest;
import com.etiya.ecommercedemo4.business.dtos.response.city.GetAllCitiesResponse;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.entities.concretes.City;

import java.util.List;

public interface ICityService {

    Result add(AddCityRequest addCityRequest);
    DataResult<List<GetAllCitiesResponse>> getAllResponsePattern();
    DataResult<List<City>> getAll();
    DataResult<City> getById(int id);

    DataResult<List<GetAllCitiesResponse>> getAllDto();


}
