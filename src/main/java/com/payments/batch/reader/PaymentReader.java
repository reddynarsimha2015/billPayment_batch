/**@Copyright 2022 keybank pvt ltd.
 * All rights are reserved,you should 
*disclose the information outside
* otherwise terms and condition will apply
 */
package com.payments.batch.reader;

import java.io.Serializable;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;



/**
 * @author YNBR 11-Apr-2022
 *
 */
public class PaymentReader implements  ItemReader{

	public Object read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		//read  the list of customer details from database 
		//convert into java object 
		return null;
	}
	
}