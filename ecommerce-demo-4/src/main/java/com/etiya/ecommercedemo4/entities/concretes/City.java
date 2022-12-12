package com.etiya.ecommercedemo4.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cities")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "towns"})
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    //@JsonIgnoreProperties("city")
    @JsonIgnore
    private Country country;

    @OneToMany(mappedBy = "city")
    //@JsonIgnoreProperties("city")
    @JsonIgnore
    private List<Town> towns;
}

