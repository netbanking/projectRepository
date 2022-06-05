package com.netbanking.main.service;

import java.util.List;

import com.netbanking.main.pojo.Login;

public interface LoginServiceInterface {

	public boolean addLogin(Login login);
	
	public boolean updateLoginByUserId(Login login);
	
	public boolean deleteByUserId(String userId);
	
	public List<Login> getAllLogin();
	
	public  Login getOneUserByUserId(String userId);
	
}
