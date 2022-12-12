package com.etiya.ecommercedemo4.business.abstracts;

import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.entities.concretes.PaymentType;

import java.util.List;

public interface IPaymentTypeService {
    DataResult<List<PaymentType>> getAll();
    DataResult<PaymentType> getById(int id);
}
