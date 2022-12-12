package com.etiya.ecommercedemo4.repository;

import com.etiya.ecommercedemo4.entities.concretes.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {

    @Query("SELECT c FROM Customer c WHERE c.birthDate BETWEEN ?1 AND ?2")
    List<Customer> findAllCustomersWithBirthDate(Date start, Date end);

    @Query("SELECT c FROM Customer c WHERE c.customerNumber LIKE %?1%")
    List<Customer> findAllCustomersLike(String customerNumber);
    Customer findByCustomerNumber(String customerNumber);


}
