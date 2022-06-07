/**@Copyright 2022 keybank pvt ltd.
 * All rights are reserved,you should 
*disclose the information outside
* otherwise terms and condition will apply
 */
package com.payments.batch.process;



import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import com.payments.batch.client.PaymentServiceClient;
import com.payments.batch.client.PaymentServiceClientImpl;
import com.payments.batch.model.BillPayments;
import com.payments.batch.model.PaymentRequest;
import com.payments.batch.model.PaymentResponse;

/**
 * @author YNBR 11-Apr-2022
 *
 */
public class PaymentProcessor implements ItemProcessor<BillPayments,PaymentResponse> {
	


	public PaymentResponse process(BillPayments item) throws Exception {
		// TODO Auto-generated method stub
		 System.out.println("--------------billpayments---are------"+item);
		 PaymentServiceClientImpl paymentServiceClient=new PaymentServiceClientImpl();
		 System.out.println("============paymentServiceClient============"+paymentServiceClient);
		 
		PaymentResponse response=paymentServiceClient.invokePayment(item);
		// System.out.println("----------response-------"+response);
		return null;
	}

	
}
