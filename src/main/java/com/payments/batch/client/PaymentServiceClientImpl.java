/**@Copyright 2022 keybank pvt ltd.
 * All rights are reserved,you should 
*disclose the information outside
* otherwise terms and condition will apply
 */
package com.payments.batch.client;

import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.payments.batch.model.BillPayments;
import com.payments.batch.model.PaymentRequest;
import com.payments.batch.model.PaymentResponse;

/**
 * @author YNBR 11-Apr-2022
 *
 */
@Component
public class PaymentServiceClientImpl  implements PaymentServiceClient{

@Autowired
RestTemplate restemplate;

	public PaymentResponse invokePayment(BillPayments req) {
		System.out.println("---------------invokePayment-----------------"+req);
		String uri="http://localhost:8990/v1/payments";
		// TODO invoke payment service
		PaymentRequest payReq=new PaymentRequest();
		payReq.setAmount(req.getAmount());
		payReq.setBillDate(req.getBill_date());
		payReq.setCustomerName(req.getName());
		payReq.setCardNumber(req.getCardnum());
		payReq.setCvvNum(req.getCvv());
		payReq.setExpDate(req.getExpdate());
		payReq.setMobileNumber(req.getMobile_num());
		//create Header
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		header.set("request-id",(String) UUID.randomUUID().toString().subSequence(0, 15));
		header.set("messageTS", new Date().toString());
		header.set("client-id", "batch");
		HttpEntity<PaymentRequest> entity=new HttpEntity<PaymentRequest>(payReq,header);
		PaymentResponse paymentResponse=null;
		restemplate=new RestTemplate();
		restemplate.getMessageConverters()
		.add(new MappingJackson2HttpMessageConverter());
		System.out.println("---restemplate-----"+restemplate);
		System.out.println("------entity-----"+entity);
		System.out.println("-------payReq-------"+payReq);
		try {
		ResponseEntity<PaymentResponse> result = restemplate.exchange(uri, HttpMethod.POST,entity ,PaymentResponse.class);
		System.out.println("-----result------"+result);
		System.out.println("-----body------"+result.getBody());
		if(result!=null && "200".equals(result.getStatusCode().OK)) {
			paymentResponse=result.getBody();
		}
		System.out.println("-----paymentResponse------"+paymentResponse);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//PaymentResponse paymentResponse=null;
		
		return paymentResponse;
	}
	public static void main(String[] args) {
		PaymentServiceClientImpl clinet=new PaymentServiceClientImpl();
		BillPayments cust=new BillPayments();
		cust.setAmount("1000");
		cust.setBill_date("22-04-2022");
		cust.setCardnum("121212121");
		cust.setCvv("1212");
		cust.setName("1212");
		cust.setExpdate("11-2029");
		cust.setMobile_num("998999999");
		clinet.invokePayment(cust);
		
	}


}
