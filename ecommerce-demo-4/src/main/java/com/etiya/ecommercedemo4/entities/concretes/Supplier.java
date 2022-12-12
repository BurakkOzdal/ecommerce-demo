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
@Table(name = "suppliers")
public class Supplier {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "supplier_number")
    private String supplierNumber;


    @ManyToOne
    @JoinColumn(name = "user_id")
   // @JsonIgnoreProperties("supplier")
    @JsonIgnore
    private User user;

    @OneToMany(mappedBy = "supplier")
   // @JsonIgnoreProperties("supplier")
    @JsonIgnore
    private List<ProductSuppliers> productSuppliers;

}
