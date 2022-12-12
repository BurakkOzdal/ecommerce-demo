package com.etiya.ecommercedemo4.repository;

import com.etiya.ecommercedemo4.entities.concretes.AddressType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressTypeRepository extends JpaRepository<AddressType,Integer> {
}
