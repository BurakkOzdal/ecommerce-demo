package com.etiya.ecommercedemo4.business.abstracts;


import com.etiya.ecommercedemo4.business.dtos.request.town.AddTownRequest;
import com.etiya.ecommercedemo4.business.dtos.response.town.AddTownResponse;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.entities.concretes.Town;

import java.util.List;

public interface ITownService {
    Result add(AddTownRequest addTownRequest);
    DataResult<List<Town>> getAll();
    DataResult<Town> getById(int id);
}
