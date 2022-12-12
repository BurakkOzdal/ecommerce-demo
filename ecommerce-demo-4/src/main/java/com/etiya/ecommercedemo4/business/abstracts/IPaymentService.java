package com.etiya.ecommercedemo4.business.abstracts;

import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.entities.concretes.Payment;

import java.util.List;

public interface IPaymentService {
    DataResult<List<Payment>> getAll();
    DataResult<Payment> getById(int id);
}
