package com.etiya.ecommercedemo4.api.controllers;

import com.etiya.ecommercedemo4.business.abstracts.ISupplierService;
import com.etiya.ecommercedemo4.business.constants.Paths;
import com.etiya.ecommercedemo4.business.dtos.request.supplier.AddSupplierRequest;
import com.etiya.ecommercedemo4.business.dtos.response.supplier.AddSupplierResponse;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.entities.concretes.Supplier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Paths.apiPrefix + "suppliers")
public class SuppliersController {

    private ISupplierService supplierService;

    public SuppliersController(ISupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Supplier>> getAll(){
        return this.supplierService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody AddSupplierRequest addSupplierRequest){
        return this.supplierService.add(addSupplierRequest);
    }
}
