package com.etiya.ecommercedemo4.business.abstracts;

import com.etiya.ecommercedemo4.business.dtos.request.productCategories.AddProductCategoriesRequest;
import com.etiya.ecommercedemo4.business.dtos.response.productCategories.AddProductCategoriesResponse;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.entities.concretes.ProductCategories;

import java.util.List;

public interface IProductCategoriesService {

    Result add(AddProductCategoriesRequest addProductCategoriesRequest);
    DataResult<List<ProductCategories>> getAll();
    DataResult<ProductCategories> getById(int id);



}
