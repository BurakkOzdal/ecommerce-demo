package com.etiya.ecommercedemo4.business.abstracts;

import com.etiya.ecommercedemo4.business.dtos.request.addressType.AddAddressTypeRequest;
import com.etiya.ecommercedemo4.business.dtos.response.addressType.AddAddressTypeResponse;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.entities.concretes.AddressType;

import javax.xml.crypto.Data;
import java.util.List;

public interface IAddressTypeService {

    Result add(AddAddressTypeRequest addAddressTypeRequest);
    DataResult<List<AddressType>> getAll();
    DataResult<AddressType> getById(int id);
}
