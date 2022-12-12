package com.etiya.ecommercedemo4.business.dtos.response.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetProductResponse {
    private int id;
    private String name;
    private double unitPrice;
    private Date productionDate;
    private int stock;
}
