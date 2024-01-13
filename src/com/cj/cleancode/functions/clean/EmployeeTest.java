/**
 * 
 */
package com.cj.cleancode.functions.clean;

import java.util.Date;

import com.cj.cleancode.functions.EmployeeType;
import com.cj.cleancode.functions.InvalidEmployeeType;

/**
 * @author CJ
 * Created on : 07-Sep-2017
 */
public class EmployeeTest {
	
	/**
	 * This is better version of previous code.
	 * It removes all loopholes in existed earlier.
	 * It supports Single Responsibility principle
	 * It supports open close principal
	 * Method : employeeFactory.makeEmployee()
	 * 		1.does only one job and does it well, it creates employee only.
	 * 		2. It has one abstraction only, to create employee
	 * 		3. No any business logic 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		EmployeeFactory factory = new EmployeeFactoryImpl();
		
		EmployeeRecord record = new EmployeeRecord();
		record.setCity("Bravos");
		record.setName("no one");
		record.setEmployeeType(EmployeeType.COMMISSIONED);
		record.setDateOfJoining(new Date());
		
		try {
			Employee noOne = factory.makeEmployee(record);
			System.out.println("isPayDay :" +noOne.isPayday());
			System.out.println("Calculated Pay Ammount :" +noOne.calculatePay());
			noOne.deliverPay(noOne.calculatePay());
		} catch (InvalidEmployeeType e) {
		
			System.out.println("an error occured :" + e.getMessage());		}
		
		
	}

}
