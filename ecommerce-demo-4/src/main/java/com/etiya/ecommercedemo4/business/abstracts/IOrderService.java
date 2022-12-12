package com.etiya.ecommercedemo4.business.abstracts;

import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.entities.concretes.Order;

import java.util.List;

public interface IOrderService {
    DataResult<List<Order>> getAll();
    DataResult<Order> getById(int id);
}
