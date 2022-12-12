package com.etiya.ecommercedemo4.business.dtos.request.cart;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class AddCartRequest {

    private double totalPrice;
    private int userId;

}
