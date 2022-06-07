/**@Copyright 2022 keybank pvt ltd.
 * All rights are reserved,you should 
*disclose the information outside
* otherwise terms and condition will apply
 */
package com.payments.batch.model;

/**
 * @author YNBR 17-May-2022
 *
 */
public class PaymentStatus {
private String mobileNumber;
private String txnStatus;
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
 * @return the txnStatus
 */
public String getTxnStatus() {
	return txnStatus;
}
/**
 * @param txnStatus the txnStatus to set
 */
public void setTxnStatus(String txnStatus) {
	this.txnStatus = txnStatus;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("PaymentStatus [mobileNumber=");
	builder.append(mobileNumber);
	builder.append(", txnStatus=");
	builder.append(txnStatus);
	builder.append("]");
	return builder.toString();
}

}
