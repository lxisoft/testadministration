package com.diviso.servease.service;

import java.util.List;

import com.diviso.servease.entity.Customer;

public interface CustomerService {
	
	public void save(Customer customer);
	
	public void delete(int id);
	
	public Customer findById(int id);
	
	public List<Customer> findAll();

}
