package com.netbanking.main.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netbanking.main.pojo.BankSlip;
import com.netbanking.main.repository.BankSlipRepositoryInterface;

@RestController
//@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("bankslip")
public class BankSlipController {


		private BankSlipRepositoryInterface bankSlipRepositoryInterface;

		@RequestMapping(value = "bankslip", method = RequestMethod.POST)
		public boolean addNewBankSlip(@RequestBody BankSlip bankSlip) {
			return bankSlipRepositoryInterface.addNewBankSlip(bankSlip);
		}
	}
	
	
