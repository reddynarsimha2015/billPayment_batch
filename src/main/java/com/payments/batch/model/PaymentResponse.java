/**@Copyright 2022 keybank pvt ltd.
 * All rights are reserved,you should 
*disclose the information outside
* otherwise terms and condition will apply
 */
package com.payments.batch.model;

/**
 * @author YNBR 11-Apr-2022
 *
 */
public class PaymentResponse {
	private StatusBock status;
	private PaymentStatus paymentStatus;
	/**
	 * @return the status
	 */
	public StatusBock getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(StatusBock status) {
		this.status = status;
	}
	/**
	 * @return the paymentStatus
	 */
	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}
	/**
	 * @param paymentStatus the paymentStatus to set
	 */
	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PaymentResponse [status=");
		builder.append(status);
		builder.append(", paymentStatus=");
		builder.append(paymentStatus);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
