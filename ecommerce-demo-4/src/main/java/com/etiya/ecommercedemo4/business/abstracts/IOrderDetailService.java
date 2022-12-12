package com.etiya.ecommercedemo4.business.abstracts;

import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.entities.concretes.OrderDetail;

import java.util.List;

public interface IOrderDetailService {
    DataResult<List<OrderDetail>> getAll();
    DataResult<OrderDetail> getById(int id);
}
