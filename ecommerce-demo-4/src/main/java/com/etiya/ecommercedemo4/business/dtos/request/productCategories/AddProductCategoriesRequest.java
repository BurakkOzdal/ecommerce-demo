package com.etiya.ecommercedemo4.business.dtos.request.productCategories;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddProductCategoriesRequest {

    private int productId;
    private int categoryId;
}
