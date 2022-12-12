package com.etiya.ecommercedemo4.api.controllers;

import com.etiya.ecommercedemo4.business.abstracts.ICategoryService;
import com.etiya.ecommercedemo4.business.constants.Paths;
import com.etiya.ecommercedemo4.business.dtos.request.category.AddCategoryRequest;
import com.etiya.ecommercedemo4.business.dtos.response.category.AddCategoryResponse;
import com.etiya.ecommercedemo4.business.dtos.response.category.GetCategoryByIdWithProductsResponse;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.entities.concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.xml.crypto.Data;
import java.util.List;

@RestController
@RequestMapping(Paths.apiPrefix +"categories")
public class CategoriesController {

    private ICategoryService categoryService;

    @Autowired
    public CategoriesController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Category>> getAll(){
        return this.categoryService.getAll();
    }

    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
    public DataResult<Category> getById(@PathVariable int id){
        return this.categoryService.getById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<Result> add(@RequestBody @Valid AddCategoryRequest addCategoryRequest){
        return new ResponseEntity<Result>(this.categoryService.add(addCategoryRequest),
                HttpStatus.CREATED);
    }
    @RequestMapping(value = "/getAllDto/{id}", method = RequestMethod.GET)
    public DataResult<List<GetCategoryByIdWithProductsResponse>> getAllDto(@PathVariable int id){
        return this.categoryService.getAllDto(id);
    }
}
