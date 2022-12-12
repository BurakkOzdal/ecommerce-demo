package com.etiya.ecommercedemo4.business.dtos.request.street;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddStreetRequest {
    private String name;
    private int districtId;
}
