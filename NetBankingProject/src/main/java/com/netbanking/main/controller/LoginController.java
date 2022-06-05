package com.netbanking.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netbanking.main.pojo.Login;
import com.netbanking.main.service.LoginServiceInterface;

@RestController
//@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("login")
public class LoginController {

	@Autowired
	private LoginServiceInterface loginServiceInterface;
 
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public boolean addNewEmployee(@RequestBody Login login ) {
		return loginServiceInterface.addLogin(login);
	}
	
}
