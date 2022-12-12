package com.etiya.ecommercedemo4.api.controllers;

import com.etiya.ecommercedemo4.business.abstracts.IProductSuppliersService;
import com.etiya.ecommercedemo4.business.constants.Paths;
import com.etiya.ecommercedemo4.business.dtos.request.productSuppliers.AddProductSuppliersRequest;
import com.etiya.ecommercedemo4.business.dtos.response.productSuppliers.AddProductSuppliersResponse;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.entities.concretes.ProductSuppliers;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Paths.apiPrefix+"productSuppliers")
public class ProductSuppliersController {

    private IProductSuppliersService productSuppliersService;

    public ProductSuppliersController(IProductSuppliersService productSuppliersService) {
        this.productSuppliersService = productSuppliersService;
    }

    @GetMapping("/getAll")
    public DataResult<List<ProductSuppliers>> getAll(){
        return this.productSuppliersService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody AddProductSuppliersRequest addProductSuppliersRequest){
        return this.productSuppliersService.add(addProductSuppliersRequest);
    }
}
