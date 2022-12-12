package com.etiya.ecommercedemo4.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "user")
   // @JsonIgnoreProperties("user")
    @JsonIgnore
    private List<Supplier> suppliers;

    @OneToMany(mappedBy = "user")
   // @JsonIgnoreProperties("user")
    @JsonIgnore
    private List<Customer> customers;

    @OneToMany(mappedBy = "user")
   // @JsonIgnoreProperties("user")
    @JsonIgnore
    private List<Payment> payments;

    @OneToMany(mappedBy = "user")
   // @JsonIgnoreProperties("user")
    @JsonIgnore
    private List<Cart> carts;

    @OneToMany(mappedBy = "user")
   // @JsonIgnoreProperties("user")
    @JsonIgnore
    private List<Address> addresses;

}
