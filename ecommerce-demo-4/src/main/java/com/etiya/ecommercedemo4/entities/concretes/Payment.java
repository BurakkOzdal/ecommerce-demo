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
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "description")
    private String description;


    @ManyToOne
    @JoinColumn(name = "user_id")
   // @JsonIgnoreProperties("payment")
    @JsonIgnore
    private User user;

    @ManyToOne
    @JoinColumn(name = "payment_type_id")
   // @JsonIgnoreProperties("payment")
    @JsonIgnore
    private PaymentType paymentType;

    @OneToMany(mappedBy = "payment")
  //  @JsonIgnoreProperties("payment")
    @JsonIgnore
    private List<Order> orders;
}
