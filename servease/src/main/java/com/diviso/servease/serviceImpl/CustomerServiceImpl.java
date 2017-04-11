package com.diviso.servease.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.diviso.servease.entity.Customer;
import com.diviso.servease.repository.CustomerRepository;
import com.diviso.servease.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void save(Customer customer) {

		customerRepository.save(customer);

	}

	@Override
	public void delete(int id) {

		customerRepository.delete(id);

	}

	@Override
	public Customer findById(int id) {
		
		return customerRepository.findById(id);
		 
		
	}

	@Override
	public List<Customer> findAll() {
		
		return customerRepository.findAll();
	}


}
