package com.etiya.ecommercedemo4.business.abstracts;

import com.etiya.ecommercedemo4.business.dtos.request.product.AddProductRequest;
import com.etiya.ecommercedemo4.business.dtos.response.product.AddProductResponse;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.entities.concretes.Product;

import java.util.List;

public interface IProductService {
    Result add(AddProductRequest addProductRequest);
    DataResult<List<Product>> getAll();
    DataResult<Product> getById(int id);
    DataResult<List<Product>> getAllByStock(int stock);
    DataResult<Product> getByName(String name);
    DataResult<List<Product>> getAllProductsUnitPriceBetween(double start,double end);


}
