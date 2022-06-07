package com.payments.batch.reader;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.payments.batch.model.BillPayments;

public class PaymentsRowMapper implements RowMapper<BillPayments> {


	public BillPayments mapRow(ResultSet rs, int rowNum) throws SQLException {

		BillPayments bill=new BillPayments();
		bill.setAmount(rs.getString("amount").toString());
		bill.setBill_date(rs.getString("bill_date"));
		bill.setCardnum(rs.getString("cardnum"));
		bill.setCvv(rs.getString("cvv"));
		bill.setExpdate(rs.getString("expdate"));
		bill.setMobile_num(rs.getString("mobile_num"));
		bill.setName(rs.getString("name"));
		bill.setPayment_date(rs.getString("payment_date"));
		return bill;
	}

}