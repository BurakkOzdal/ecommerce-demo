package com.etiya.ecommercedemo4.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product_categories")
public class ProductCategories {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "category_id")
   // @JsonIgnoreProperties("productCategories")
    @JsonIgnore
    private Category category;

    @ManyToOne
    @JoinColumn(name = "product_id")
  //  @JsonIgnoreProperties("productCategories")
    @JsonIgnore
    private Product product;

}
