package com.etiya.ecommercedemo4.business.dtos.response.town;

import com.etiya.ecommercedemo4.entities.concretes.City;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddTownResponse {

    private int id;
    private String name;
    private City city;
}
