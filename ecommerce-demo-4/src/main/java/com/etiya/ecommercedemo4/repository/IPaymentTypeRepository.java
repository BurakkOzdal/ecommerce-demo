package com.etiya.ecommercedemo4.repository;

import com.etiya.ecommercedemo4.entities.concretes.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPaymentTypeRepository extends JpaRepository<PaymentType,Integer> {
}
