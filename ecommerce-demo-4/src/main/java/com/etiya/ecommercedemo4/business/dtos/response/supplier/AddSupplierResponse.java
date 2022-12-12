package com.etiya.ecommercedemo4.business.dtos.response.supplier;

import com.etiya.ecommercedemo4.entities.concretes.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddSupplierResponse {

    private int supplierId;
    private String supplierNumber;
    private User user;
}
