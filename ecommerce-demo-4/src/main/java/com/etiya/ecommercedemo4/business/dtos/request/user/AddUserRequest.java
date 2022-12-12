package com.etiya.ecommercedemo4.business.dtos.request.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddUserRequest {

    private String name;
    private String phoneNumber;
    private String email;
}
