package com.etiya.ecommercedemo4.repository;

import com.etiya.ecommercedemo4.entities.concretes.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderDetailRepository extends JpaRepository<OrderDetail,Integer> {

}
