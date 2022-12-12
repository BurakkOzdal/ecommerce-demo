package com.etiya.ecommercedemo4.business.dtos.response.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddUserResponse {

    private int id;
    private String name;
    private String phoneNumber;
    private String email;
}