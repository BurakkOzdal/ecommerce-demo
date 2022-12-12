package com.etiya.ecommercedemo4.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "order_date")
    private Date orderDate;


    @ManyToOne
    @JoinColumn(name = "payment_id")
    //@JsonIgnoreProperties("order")
    @JsonIgnore
    private Payment payment;

    @ManyToOne
    @JoinColumn(name = "order_detail_id")
    //@JsonIgnoreProperties("order")
    @JsonIgnore
    private OrderDetail orderDetail;
}
