package com.etiya.ecommercedemo4.business.dtos.response.district;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddDistrictResponse {

    private int id;
    private String name;
    private String townName;
}
