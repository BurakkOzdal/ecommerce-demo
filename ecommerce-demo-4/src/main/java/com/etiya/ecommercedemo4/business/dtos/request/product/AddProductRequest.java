package com.etiya.ecommercedemo4.business.dtos.request.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class AddProductRequest {

    @NotNull(message = "NOT NULL")
    @NotBlank(message = "NOT BLANK")
    @Size(min = 3,max = 50,message = "SIZE")
    private String name;

    @Positive(message = "MUST BE POSITIVE")
    private double unitPrice;

    private Date productionDate;

    @PositiveOrZero(message = "MUST BE POSITIVE OR ZERO")
    private int stock;

    @Positive(message = "MUST BE POSITIVE")
    private int category_id;

}
