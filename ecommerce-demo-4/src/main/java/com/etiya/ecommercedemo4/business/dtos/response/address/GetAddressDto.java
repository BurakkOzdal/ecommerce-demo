package com.etiya.ecommercedemo4.business.dtos.response.address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class GetAddressDto {

    private int id;
    private String userName;
    private String streetName;
    private String districtName;
    private String townName;
    private String cityName;
    private String countryName;
}
