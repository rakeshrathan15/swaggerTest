package com.neoteric.swaggerTest.repository;


import com.neoteric.swaggerTest.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomValidationRepository extends JpaRepository<CustomerEntity,Long> {




}
