package com.etiya.ecommercedemo4.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "towns")
public class Town {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "city_id")
    //@JsonIgnoreProperties("town")
    @JsonIgnore
    private City city;

    @OneToMany(mappedBy = "town")
    //@JsonIgnoreProperties("town")
    @JsonIgnore
    private List<District> districts;
}