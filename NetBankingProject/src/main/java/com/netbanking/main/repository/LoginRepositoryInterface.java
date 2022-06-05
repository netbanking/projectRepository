package com.netbanking.main.repository;

import java.util.List;

import com.netbanking.main.pojo.Login;

public interface LoginRepositoryInterface {

	
public boolean addLogin(Login login);
	
	public boolean updateLoginByUserId(Login login);
	
	public boolean deleteByUserId(String userId);
	
	public List<Login> getAllLogin();
	
	public  Login getOneUserByUserId(String userId);
	
	
}
