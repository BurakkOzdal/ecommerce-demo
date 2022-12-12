package com.etiya.ecommercedemo4.business.dtos.request.address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddAddressRequest {

    @Size(min = 2,max = 20,message = "SIZE")
    private String description;

    @Positive
    private int addressTypeId;

   /* private int countryId;
    private int cityId;
    private int townId;
    private int districtId; */

    @Positive
    private int streetId;

    @Positive
    private int userId;


}
