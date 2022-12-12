package com.etiya.ecommercedemo4.business.dtos.request.city;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddCityRequest {
    private int countryId;
    private String name;
}
