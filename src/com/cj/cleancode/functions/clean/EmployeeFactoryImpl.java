/**
 * 
 */
package com.cj.cleancode.functions.clean;

import com.cj.cleancode.functions.InvalidEmployeeType;

/**
 * @author CJ Created on : 07-Sep-2017
 */
public class EmployeeFactoryImpl implements EmployeeFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cj.cleancode.functions.clean.EmployeeFactory#makeEmployee(com.cj.
	 * cleancode.functions.clean.EmployeeRecord)
	 */
	@Override
	public Employee makeEmployee(EmployeeRecord record) throws InvalidEmployeeType {
		// one abstraction per function

		switch (record.getEmployeeType()) {
		case COMMISSIONED:
			return new CommissionedEmployee(record);
		case SALARIED:
			return new SalariedEmployee(record);
		case HOURLY:
			return new HourlyEmployee(record);
		default:
			throw new InvalidEmployeeType(record.getEmployeeType());
		}
	}

}
