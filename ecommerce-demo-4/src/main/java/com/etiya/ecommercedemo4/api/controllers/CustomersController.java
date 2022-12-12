package com.etiya.ecommercedemo4.api.controllers;

import com.etiya.ecommercedemo4.business.abstracts.ICustomerService;
import com.etiya.ecommercedemo4.business.constants.Paths;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.entities.concretes.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(Paths.apiPrefix +"customers")
public class CustomersController {

    private ICustomerService customerService;

    @Autowired
    public CustomersController(ICustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping("/getAll")
    public DataResult<List<Customer>> getAll(){
        return this.customerService.getAll();
    }

    @GetMapping("{id}")
    public DataResult<Customer> getById(@PathVariable int id){
        return this.customerService.getById(id);
    }


    @GetMapping("/getAllCustomersWithBirthDate")
    public DataResult<List<Customer>> getAllCustomersWithBirthDate(@RequestParam("start")
                                                           @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)Date start,
                                                       @RequestParam("end")
                                                       @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)Date end){
        return this.customerService.getAllCustomersWithBirthDate(start, end);
    }

    @GetMapping("/getAllCustomersLike")
    public DataResult<List<Customer>> getAllCustomersLike(@RequestParam("customerNumber") String customerNumber){
        return this.customerService.getAllCustomersLike(customerNumber);
    }


    @GetMapping("/findByCustomerNumber")
    public DataResult<Customer> getByCustomerNumber(@RequestParam("customerNumber") String customerNumber){
        return this.customerService.getByCustomerNumber(customerNumber);
    }
}
