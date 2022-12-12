package com.etiya.ecommercedemo4.business.abstracts;

import com.etiya.ecommercedemo4.business.dtos.request.address.AddAddressRequest;
import com.etiya.ecommercedemo4.business.dtos.response.address.AddAddressResponse;
import com.etiya.ecommercedemo4.business.dtos.response.address.GetAddressDto;
import com.etiya.ecommercedemo4.core.util.results.DataResult;
import com.etiya.ecommercedemo4.core.util.results.Result;
import com.etiya.ecommercedemo4.entities.concretes.*;

import java.util.List;

public interface IAddressService {

    Result add(AddAddressRequest addAddressRequest);
    DataResult<List<Address>> getAll();
    DataResult<Address> getById(int id);
    DataResult<List<Address>> getByAddressType();
    DataResult<GetAddressDto> getAddressDto(int id);

    /*Country getCountryByCityId(int id);
    City getCityByTownId(int id);
    Town getTownByDistrictId(int id);
    District getDistrictByStreetId(int id);
*/

}
