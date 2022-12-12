package com.etiya.ecommercedemo4.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "product_suppliers")
public class ProductSuppliers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "product_id")
   // @JsonIgnoreProperties("productSuppliers")
    @JsonIgnore
    private Product product;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
   // @JsonIgnoreProperties("productSuppliers")
    @JsonIgnore
    private Supplier supplier;

    @OneToMany(mappedBy = "productSuppliers")
  //  @JsonIgnoreProperties("productSuppliers")
    @JsonIgnore
    private List<OrderDetail> orderDetails;
}
