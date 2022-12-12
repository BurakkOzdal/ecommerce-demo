package com.etiya.ecommercedemo4.api.controllers;

import com.etiya.ecommercedemo4.business.abstracts.ICountryService;
import com.etiya.ecommercedemo4.business.constants.Paths;
import com.etiya.ecommercedemo4.business.dtos.request.country.AddCountryRequest;
import com.etiya.ecommercedemo4.business.dtos.response.country.AddCountryResponse;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.entities.concretes.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Paths.apiPrefix +"countries")
public class CountriesController {

    private ICountryService countryService;

    @Autowired
    public CountriesController(ICountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Country>> getAll(){
        return this.countryService.getAll();
    }

    @GetMapping("{id}")
    public DataResult<Country> getById(@PathVariable int id){
        return this.countryService.getById(id);
    }

    @GetMapping("/getAllOrderedByName")
    public DataResult<List<Country>> getAllOrderedByName(){
        return this.countryService.getAllCountriesOrdered();
    }

    @GetMapping("/getByName")
    public DataResult<Country> getByName(String name){
        return this.countryService.getByName(name);
    }

    @PostMapping("/add")
    public ResponseEntity<Result> add(AddCountryRequest addCountryRequest){
        return new ResponseEntity<Result>(this.countryService.add(addCountryRequest), HttpStatus.CREATED);
    }
}
