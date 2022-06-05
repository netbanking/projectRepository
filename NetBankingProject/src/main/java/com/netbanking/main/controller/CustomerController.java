package com.netbanking.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netbanking.main.pojo.Customer;
import com.netbanking.main.service.CustomerServiceInterface;

@RestController
//@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	private CustomerServiceInterface customerServiceInterface;

	@RequestMapping(value = "customer", method = RequestMethod.POST)
	public boolean addNewEmployee(@RequestBody Customer customer) {
		System.out.println("object received");
		System.out.println(customer);
		return customerServiceInterface.addNewCustomer(customer);
	}
}
