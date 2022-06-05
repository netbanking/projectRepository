package com.netbanking.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netbanking.main.pojo.BankSlip;
import com.netbanking.main.repository.BankSlipRepositoryInterface;
import com.netbanking.main.service.BankSlipService;
import com.netbanking.main.service.BankSlipServiceInterface;

@RestController
//@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("bankslip")
public class BankSlipController {
		
		@Autowired
		private BankSlipServiceInterface bankSlipService;

		@RequestMapping(value = "bankslip", method = RequestMethod.POST)
		public boolean addNewBankSlip(@RequestBody BankSlip bankSlip) {
			return bankSlipService.addNewBankSlip(bankSlip);
		}
	}
	
	
