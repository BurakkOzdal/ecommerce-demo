package com.etiya.ecommercedemo4.business.dtos.response.product;


import com.etiya.ecommercedemo4.entities.concretes.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddProductResponse {

    private int id;
    private String name;
    private double unitPrice;
    private Date productionDate;
    private int stock;
    //private String categoryName;
    private Category category;
}
