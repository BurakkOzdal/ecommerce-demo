package com.etiya.ecommercedemo4.business.dtos.request.town;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddTownRequest {

    private String name;
    private int cityId;
}
