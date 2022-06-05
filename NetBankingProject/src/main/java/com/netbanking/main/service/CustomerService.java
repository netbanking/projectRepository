package com.netbanking.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netbanking.main.pojo.Customer;
import com.netbanking.main.repository.CustomerRepositoryInterface;

@Service
public class CustomerService implements CustomerServiceInterface {

	@Autowired
	private CustomerRepositoryInterface customerRepositoryInterface;

	@Override
	public boolean addNewCustomer(Customer customer) {
		return customerRepositoryInterface.addNewCustomer(customer);
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		return customerRepositoryInterface.updateCustomer(customer);
	}

	@Override
	public boolean deleteCustomerByCustomerId(int customerId) {
		return customerRepositoryInterface.deleteCustomerByCustomerId(customerId);
	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) {
		return customerRepositoryInterface.getCustomerByCustomerId(customerId);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customerRepositoryInterface.getAllCustomer();
	}

}
