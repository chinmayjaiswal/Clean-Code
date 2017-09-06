/**
 * 
 */
package com.cj.cleancode.functions;

/**
 * @author CJ Created on : 06-Sep-2017
 */
public class Payroll {

	public int calculatePay(Employee employee) throws InvalidEmployeeType {
		switch (employee.getType()) {
		case COMMISSIONED:
			return calculateCommissionedPay(employee);
		case HOURLY:
			return calculateHourlyPay(employee);
		case SALARIED:
			return calculateSalariedPay(employee);
		default:
			throw new InvalidEmployeeType(employee.getType());
		}
	}
	
	private int calculateHourlyPay(Employee employee)
	{
		return 1;
	}
	
	private int calculateSalariedPay(Employee employee)
	{
		return 2;
	}
	
	private int calculateCommissionedPay(Employee employee)
	{
		return 3;
	}
}
