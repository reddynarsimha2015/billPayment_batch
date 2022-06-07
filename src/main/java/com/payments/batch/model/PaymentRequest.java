/**@Copyright 2022 keybank pvt ltd.
 * All rights are reserved,you should 
*disclose the information outside
* otherwise terms and condition will apply
 */
package com.payments.batch.model;
import java.util.List;


public class PaymentRequest {
	private String customerName;
	private String cardNumber;
	private  String cvvNum;
	private String expDate;
	private String mobileNumber;
	private String amount;
	private String billDate;
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}
	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	/**
	 * @return the cvvNum
	 */
	public String getCvvNum() {
		return cvvNum;
	}
	/**
	 * @param cvvNum the cvvNum to set
	 */
	public void setCvvNum(String cvvNum) {
		this.cvvNum = cvvNum;
	}
	/**
	 * @return the expDate
	 */
	public String getExpDate() {
		return expDate;
	}
	/**
	 * @param expDate the expDate to set
	 */
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
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
	 * @return the billDate
	 */
	public String getBillDate() {
		return billDate;
	}
	/**
	 * @param billDate the billDate to set
	 */
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	@Override
	public String toString() {
		return "PaymentRequest [customerName=" + customerName + ", cardNumber=" + cardNumber + ", cvvNum=" + cvvNum
				+ ", expDate=" + expDate + ", mobileNumber=" + mobileNumber + ", amount=" + amount + ", billDate="
				+ billDate + "]";
	}
	
	
}
