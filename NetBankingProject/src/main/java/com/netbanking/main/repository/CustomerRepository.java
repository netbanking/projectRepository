package com.netbanking.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.netbanking.main.pojo.Customer;

@Repository
public class CustomerRepository implements CustomerRepositoryInterface {

	private int resultCount;

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private static final String INSERT_CUSTOMER = "INSERT INTO CUSTOMER(customerId,firstName,lastName,address,city,state,zip,phoneNumber,telePhoneNumber,emailID,status,login) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
	private static final String SELECT_ALL_CUSTOMER = "SELECT * FROM  CUSTOMER";
	private static final String UPDATE_CUSTOMER = "UPDATE CUSTOMER SET  firstName= ?,lastName = ? ,address=?,city=?,state=?,zip=?,phoneNumber=?,telePhoneNumber=?,emailID=?,status=?,login=?"
			+ "	WHERE customerId  = ?";
	private static final String DELETE_CUSTOMER = "DELETE CUSTOMER WHERE customerId = ?";
	private static final String SELECT_SINGLE_CUSROMER = "SELECT * FROM CUSTOMER WHERE customerId = ?";

	@Override
	public boolean addNewCustomer(Customer customer) {
		System.out.println("into repository addNewCustumer");
		System.out.println(customer);
		Object[] args = { customer.getCustomerId(), customer.getFirstName(), customer.getLastName(),
				customer.getAddress(), customer.getCity(), customer.getState(), customer.getZip(),
				customer.getPhoneNumber(), customer.getTelePhoneNumber(), customer.getEmailID(), customer.getStatus(),
				customer.getLogin() };

		resultCount = jdbcTemplate.update(INSERT_CUSTOMER, args);

		if (resultCount > 0)
			return true;
		else
			return false;

	}

	@Override
	public boolean updateCustomer(Customer customer) {
		System.out.println("into repository addNewCustumer");
		System.out.println(customer);
		Object[] args = { customer.getCustomerId(), customer.getFirstName(), customer.getLastName(),
				customer.getAddress(), customer.getCity(), customer.getState(), customer.getZip(),
				customer.getPhoneNumber(), customer.getTelePhoneNumber(), customer.getEmailID(), customer.getStatus(),
				customer.getLogin() };
		resultCount = jdbcTemplate.update(UPDATE_CUSTOMER, args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteCustomerByCustomerId(int customerId) {
		System.out.println("into repository addNewCustumer");
		System.out.println(customerId);
		Object[] args = { customerId };
		resultCount = jdbcTemplate.update(DELETE_CUSTOMER, args);
		if (resultCount > 0)
			return true;
		else
			return false;

	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) {
		System.out.println("into repository addNewCustumer");
		System.out.println(customerId);
		Object[] args = { customerId };
		Customer customer = jdbcTemplate.queryForObject(SELECT_SINGLE_CUSROMER, new CustomerRepositoryRowMapper(),
				args);
		return customer;
	}

	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> allCustomer = jdbcTemplate.query(SELECT_ALL_CUSTOMER, new CustomerRepositoryRowMapper());
		return allCustomer;

	}

}
