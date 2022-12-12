package com.etiya.ecommercedemo4.api.controllers;

import com.etiya.ecommercedemo4.business.abstracts.IStreetService;
import com.etiya.ecommercedemo4.business.constants.Paths;
import com.etiya.ecommercedemo4.business.dtos.request.street.AddStreetRequest;
import com.etiya.ecommercedemo4.business.dtos.response.street.AddStreetResponse;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.entities.concretes.Street;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Paths.apiPrefix +"streets")
public class StreetsController {

    private IStreetService streetService;

    public StreetsController(IStreetService streetService) {
        this.streetService = streetService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Street>> getAll(){
        return this.streetService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody AddStreetRequest addStreetRequest){
        return this.streetService.add(addStreetRequest);
    }
    @GetMapping("{id}")
    public DataResult<Street> getById(@PathVariable int id){
        return this.streetService.getById(id);
    }
}
