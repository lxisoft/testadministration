package com.diviso.servease.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.servease.entity.Customer;
import com.diviso.servease.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	@ResponseBody
	public String saveCustomer(@ModelAttribute Customer customer) {
		try {

			customerService.save(customer);
		} catch (Exception e) {

			return "Error save the customer: " + e.toString();
		}

		return "customer succesfully added!";
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String updateName(@ModelAttribute Customer customer, @PathVariable int id) {
		try {
			Customer c = customerService.findById(id);
			c.setAddress2(customer.getAddress());
			c.setCity(customer.getCity());
			c.setCountry(customer.getCountry());
			c.setCurDate(customer.getCurDate());
			c.setCurDebt(customer.getCurDebt());
			c.setFax(customer.getFax());
			c.setFirstName(customer.getFirstName());
			c.setLastName(customer.getLastName());
			c.setMaxDebt(customer.getMaxDebt());
			c.setNote(customer.getNote());
			c.setPhone(customer.getPhone());
			c.setPhone2(customer.getPhone2());
			c.setPostal(customer.getPostal());
			c.setRegion(customer.getRegion());
			c.setSearchKey(customer.getSearchKey());
			c.setTaxCategory(customer.getTaxCategory());
			c.setTaxId(customer.getTaxId());
			c.setVisible(true);
			c.setAddress(customer.getAddress());
			c.setEmail(customer.getEmail());
			c.setName(customer.getName());
			customerService.save(c);
		} catch (Exception ex) {

			return "Error updating the customer: " + ex.toString();
		}

		return "customer succesfully updated!";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String deleteCustomer(@ModelAttribute Customer customer, @PathVariable int id) {
		try {

			customerService.delete(id);
		} catch (Exception ex) {

			return "Error deleting the customer: " + ex.toString();
		}

		return "customer succesfully deleted!";
	}

	@RequestMapping(value = "/customerList", method = RequestMethod.GET)
	public @ResponseBody List<Customer> customerList(@ModelAttribute Customer customer) {

		List<Customer> c = customerService.findAll();

		return c;
	}
}
