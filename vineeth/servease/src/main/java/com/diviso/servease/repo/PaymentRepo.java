package com.diviso.servease.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diviso.servease.entity.Payment;



public interface PaymentRepo extends JpaRepository<Payment, Integer>  {

}
