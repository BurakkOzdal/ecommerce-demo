package com.etiya.ecommercedemo4.repository;

import com.etiya.ecommercedemo4.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {
}
