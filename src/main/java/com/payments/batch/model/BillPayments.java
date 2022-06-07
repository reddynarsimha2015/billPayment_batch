/**@Copyright 2022 keybank pvt ltd.
 * All rights are reserved,you should 
*disclose the information outside
* otherwise terms and condition will apply
 */
package com.payments.batch.model;



/**
 * @author YNBR 14-May-2022
 *
 */
public class BillPayments {
private String name;
private String mobile_num;
private String bill_date;
private String payment_date;
private String amount;
private String cardnum;
private String cvv;
private String expdate;
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the mobile_num
 */
public String getMobile_num() {
	return mobile_num;
}
/**
 * @param mobile_num the mobile_num to set
 */
public void setMobile_num(String mobile_num) {
	this.mobile_num = mobile_num;
}
/**
 * @return the bill_date
 */
public String getBill_date() {
	return bill_date;
}
/**
 * @param bill_date the bill_date to set
 */
public void setBill_date(String bill_date) {
	this.bill_date = bill_date;
}
/**
 * @return the payment_date
 */
public String getPayment_date() {
	return payment_date;
}
/**
 * @param payment_date the payment_date to set
 */
public void setPayment_date(String payment_date) {
	this.payment_date = payment_date;
}
/**
 * @return the amount
 */
public String getAmount() {
	return amount;
}
/**
 * @param amount the amount to set
 */
public void setAmount(String amount) {
	this.amount = amount;
}
/**
 * @return the cardnum
 */
public String getCardnum() {
	return cardnum;
}
/**
 * @param cardnum the cardnum to set
 */
public void setCardnum(String cardnum) {
	this.cardnum = cardnum;
}
/**
 * @return the cvv
 */
public String getCvv() {
	return cvv;
}
/**
 * @param cvv the cvv to set
 */
public void setCvv(String cvv) {
	this.cvv = cvv;
}
/**
 * @return the expdate
 */
public String getExpdate() {
	return expdate;
}
/**
 * @param expdate the expdate to set
 */
public void setExpdate(String expdate) {
	this.expdate = expdate;
}
@Override
public String toString() {
	return "BillPayments [name=" + name + ", mobile_num=" + mobile_num + ", bill_date=" + bill_date + ", payment_date="
			+ payment_date + ", amount=" + amount + ", cardnum=" + cardnum + ", cvv=" + cvv + ", expdate=" + expdate
			+ "]";
}


}
