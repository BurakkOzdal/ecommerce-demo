package com.etiya.ecommercedemo4.api.controllers;

import com.etiya.ecommercedemo4.business.abstracts.IProductService;
import com.etiya.ecommercedemo4.business.constants.Paths;
import com.etiya.ecommercedemo4.business.dtos.request.product.AddProductRequest;
import com.etiya.ecommercedemo4.business.dtos.response.product.AddProductResponse;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(Paths.apiPrefix +"products")
public class ProductsController {


    private IProductService productService;

    @Autowired
    public ProductsController(IProductService IProductService) {
        this.productService = IProductService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Product>> getAll(){
        return this.productService.getAll();
    }

    @GetMapping("{id}")
    public DataResult<Product> getById(@PathVariable int id){ return  this.productService.getById(id);}

    @GetMapping("/getAllByStock")
    public DataResult<List<Product>> getAllByStock(@RequestParam("stock") int stock){
        return this.productService.getAllByStock(stock);
    }

    @GetMapping("/getByName")
    public DataResult<Product> getAllByStock(@RequestParam("name") String name){
        return this.productService.getByName(name);
    }

    @GetMapping("/getAllProductsBetween")
    public DataResult<List<Product>> getAllProductsBetween(double start,double end){
        return this.productService.getAllProductsUnitPriceBetween(start, end);
    }

    @PostMapping("/add")
    public ResponseEntity<Result> add(@RequestBody @Valid AddProductRequest addProductRequest){
        return  new ResponseEntity<Result>(this.productService.add(addProductRequest), HttpStatus.CREATED);
    }

}
