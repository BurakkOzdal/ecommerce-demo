package com.etiya.ecommercedemo4.business.dtos.response.city;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetAllCitiesResponse {

    private int id;
    private String name;
    private String countryName;
}
