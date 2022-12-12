package com.etiya.ecommercedemo4.business.dtos.response.productSuppliers;

import com.etiya.ecommercedemo4.entities.concretes.Product;
import com.etiya.ecommercedemo4.entities.concretes.Supplier;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddProductSuppliersResponse {

    private int id;
    private int productId;
    private int supplierId;

}