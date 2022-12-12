package com.etiya.ecommercedemo4.business.abstracts;

import com.etiya.ecommercedemo4.business.dtos.request.country.AddCountryRequest;
import com.etiya.ecommercedemo4.business.dtos.response.country.AddCountryResponse;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.entities.concretes.Country;

import java.util.List;

public interface ICountryService {


    Result add(AddCountryRequest addCountryRequest);
    DataResult<List<Country>> getAll();
    DataResult<Country> getById(int id);
    DataResult<Country> getByName(String name);
    DataResult<List<Country>> getAllCountriesOrdered();
}
