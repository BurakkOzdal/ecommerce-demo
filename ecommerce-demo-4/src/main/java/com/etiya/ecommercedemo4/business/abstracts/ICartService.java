package com.etiya.ecommercedemo4.business.abstracts;

import com.etiya.ecommercedemo4.business.dtos.request.cart.AddCartRequest;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.entities.concretes.Cart;

import java.util.List;

public interface ICartService {
    DataResult<List<Cart>> getAll();
    DataResult<Cart> getById(int id);

    Result add(AddCartRequest addCartRequest);

}
