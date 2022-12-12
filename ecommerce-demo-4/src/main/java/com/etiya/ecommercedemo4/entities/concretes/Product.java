package com.etiya.ecommercedemo4.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "stock")
    private int stock;

    @Column(name = "production_date")
    private Date productionDate;

    @OneToMany(mappedBy = "product")
   // @JsonIgnoreProperties("product")
    @JsonIgnore
    private List<ProductCategories> productCategories;

    @OneToMany(mappedBy = "product")
   // @JsonIgnoreProperties("product")
    @JsonIgnore
    private List<ProductSuppliers> productSuppliers;




}
