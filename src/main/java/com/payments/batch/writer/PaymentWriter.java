/**@Copyright 2022 keybank pvt ltd.
 * All rights are reserved,you should 
*disclose the information outside
* otherwise terms and condition will apply
 */
package com.payments.batch.writer;

import java.io.Serializable;
import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.payments.batch.model.PaymentResponse;


/**
 * @author YNBR 11-Apr-2022
 *
 */
public class PaymentWriter implements ItemWriter<PaymentResponse> {

	public void write(List<?  extends PaymentResponse> items) throws Exception {
		// write the  data into database or any other destination location
		
	}
	
}
