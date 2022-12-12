package com.etiya.ecommercedemo4.api.controllers;

import com.etiya.ecommercedemo4.business.abstracts.ICityService;
import com.etiya.ecommercedemo4.business.constants.Paths;
import com.etiya.ecommercedemo4.business.dtos.request.city.AddCityRequest;
import com.etiya.ecommercedemo4.business.dtos.response.city.GetAllCitiesResponse;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.entities.concretes.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Paths.apiPrefix +"cities")
public class CitiesController {
    private ICityService cityService;

    @Autowired
    public CitiesController(ICityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/getAll")
    public DataResult<List<City>> getAll(){
        return this.cityService.getAll();
    }

    @GetMapping("{id}")
    public DataResult<City> getById(@PathVariable int id){
        return this.cityService.getById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<Result> add(AddCityRequest addCityRequest){
        return new ResponseEntity<Result>(this.cityService.add(addCityRequest), HttpStatus.CREATED);
    }

    @GetMapping("/getAllCitiesManuel")
    public DataResult<List<GetAllCitiesResponse>> getAllCitiesResponseResponseEntity(){
        return this.cityService.getAllResponsePattern();
    }

    @GetMapping("/getAllCitiesDto")
    public DataResult<List<GetAllCitiesResponse>> getAllDto(){
        return this.cityService.getAllDto();
    }

}
