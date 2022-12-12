package com.etiya.ecommercedemo4.repository;

import com.etiya.ecommercedemo4.entities.concretes.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<Order,Integer> {
}
