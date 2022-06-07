/**@Copyright 2022 keybank pvt ltd.
 * All rights are reserved,you should 
*disclose the information outside
* otherwise terms and condition will apply
 */
package com.payments.batch.client;

import org.springframework.stereotype.Component;

import com.payments.batch.model.BillPayments;
import com.payments.batch.model.PaymentResponse;

/**
 * @author YNBR 11-Apr-2022
 *
 */
@Component
public interface PaymentServiceClient {
public PaymentResponse invokePayment(BillPayments req);
	

}
