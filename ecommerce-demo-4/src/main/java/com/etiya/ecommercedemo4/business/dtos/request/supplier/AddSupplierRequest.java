package com.etiya.ecommercedemo4.business.dtos.request.supplier;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddSupplierRequest {

    private String supplierNumber;
    private int userId;
}
