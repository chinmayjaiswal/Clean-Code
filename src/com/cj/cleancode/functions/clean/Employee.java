/**
 * 
 */
package com.cj.cleancode.functions.clean;

/**
 * @author CJ Created on : 07-Sep-2017
 */
public abstract class Employee {
	private String name;
	
	private String city;
	
	public abstract boolean isPayday();

	public abstract int calculatePay();

	public abstract void deliverPay(int ammount);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
