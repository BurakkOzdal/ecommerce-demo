package com.etiya.ecommercedemo4.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "address_type_id")
   // @JsonIgnoreProperties("address")
    @JsonIgnore
    private AddressType addressType;

    @ManyToOne
    @JoinColumn(name = "street_id")
   // @JsonIgnoreProperties("address")
    @JsonIgnore
    private Street street;

    @ManyToOne
    @JoinColumn(name = "user_id")
   // @JsonIgnoreProperties("address")
    @JsonIgnore
    private User user;
}
