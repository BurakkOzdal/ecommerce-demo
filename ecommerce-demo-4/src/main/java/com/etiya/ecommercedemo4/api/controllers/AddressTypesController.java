package com.etiya.ecommercedemo4.api.controllers;

import com.etiya.ecommercedemo4.business.abstracts.IAddressTypeService;
import com.etiya.ecommercedemo4.business.constants.Paths;
import com.etiya.ecommercedemo4.business.dtos.request.addressType.AddAddressTypeRequest;
import com.etiya.ecommercedemo4.business.dtos.response.addressType.AddAddressTypeResponse;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.entities.concretes.AddressType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Paths.apiPrefix +"addresstypes")
public class AddressTypesController {
    private IAddressTypeService addressTypeService;

    @Autowired
    public AddressTypesController(IAddressTypeService addressTypeService) {
        this.addressTypeService = addressTypeService;
    }

    @GetMapping("/getall")
    public DataResult<List<AddressType>> getAll(){
        return this.addressTypeService.getAll();
    }

    @GetMapping("{id}")
    public DataResult<AddressType> getById(@PathVariable int id){
        return this.addressTypeService.getById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<Result> add(@RequestBody AddAddressTypeRequest addAddressTypeRequest){
        return new ResponseEntity<Result>(this.addressTypeService.add(addAddressTypeRequest),
                HttpStatus.CREATED);
    }


}
