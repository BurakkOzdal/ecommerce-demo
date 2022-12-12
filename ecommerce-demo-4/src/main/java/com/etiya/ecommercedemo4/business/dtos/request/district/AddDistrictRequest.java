package com.etiya.ecommercedemo4.business.dtos.request.district;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddDistrictRequest {

    private String name;
    private int townId;
}
