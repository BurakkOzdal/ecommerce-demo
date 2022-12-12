package com.etiya.ecommercedemo4.business.dtos.response.productCategories;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddProductCategoriesResponse {
    private int id;
    private int productId;
    private int categoryId;
}
