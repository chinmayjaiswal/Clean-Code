/**
 * 
 */
package com.cj.cleancode.functions.clean;

/**
 * @author CJ Created on : 07-Sep-2017
 */
public class SalariedEmployee extends Employee {

	private EmployeeRecord record;
	
	/**
	 * 
	 */
	public SalariedEmployee(EmployeeRecord record) {
		this.record = record;
		super.setName(record.getName());
		super.setCity(record.getCity());
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cj.cleancode.functions.clean.Employee#isPayday(java.util.Date)
	 */
	@Override
	public boolean isPayday() {
		// some business logic
		return record.getDateOfJoining() != null ? true : false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cj.cleancode.functions.clean.Employee#calculatePay()
	 */
	@Override
	public int calculatePay() {
		//some business logic
		return 3;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cj.cleancode.functions.clean.Employee#deliverPay(int)
	 */
	@Override
	public void deliverPay(int ammount) {
		System.out.println("Paid Ammount : "+ ammount);

	}
	
	/**
	 * @return the record
	 */
	public EmployeeRecord getRecord() {
		return record;
	}
	
	/**
	 * @param record the record to set
	 */
	public void setRecord(EmployeeRecord record) {
		this.record = record;
	}

}
