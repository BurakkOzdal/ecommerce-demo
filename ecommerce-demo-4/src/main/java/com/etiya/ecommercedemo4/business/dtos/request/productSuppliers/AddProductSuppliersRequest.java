package com.etiya.ecommercedemo4.business.dtos.request.productSuppliers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddProductSuppliersRequest {

    private int productId;
    private int supplierId;

}
