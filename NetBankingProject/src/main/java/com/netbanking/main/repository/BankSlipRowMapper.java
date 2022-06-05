package com.netbanking.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import com.netbanking.main.pojo.BankSlip;



public class BankSlipRowMapper {

	public BankSlip mapRow(ResultSet resultSet, int i) throws SQLException {
		int bankSlip = resultSet.getInt("bankSlip");
		LocalDate slipDate = resultSet.getLocalDate("chequeDate");
	     LocalDate slipDate=resultSet.getLocalDate("slipdate");
	     int payersAccountNumber=resultSet.getInt("payersAccountNumber");
	     String payerBank=resultSet.getString("payersbank");
	     double bankSlipAmount=resultSet.getDouble("");
	     String chequeStatus=resultSet.getString("");
	     account=resultSet.getaccount;
	     ChequeDetails chequeDetails=resultSet.getchequeDetails;

		BankSlip bankSlip2 = new BankSlip(bankSlipID,chequeDate, slipDate, payersAccountNumber, payerBank, bankSlipAmount, chequeStatus, account,chequeDetails);
		return bankSlip2;
	}
	
}
