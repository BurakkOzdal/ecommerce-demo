package com.etiya.ecommercedemo4.business.abstracts;

import com.etiya.ecommercedemo4.business.dtos.request.street.AddStreetRequest;
import com.etiya.ecommercedemo4.business.dtos.response.street.AddStreetResponse;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.entities.concretes.Street;

import java.util.List;

public interface IStreetService {

    Result add(AddStreetRequest addStreetRequest);
    DataResult<List<Street>> getAll();


    DataResult<Street> getById(int id);
}
