/**
 * 
 */
package com.cj.cleancode.functions.clean;

import java.util.Date;

import com.cj.cleancode.functions.EmployeeType;

/**
 * @author CJ Created on : 07-Sep-2017
 */
public class EmployeeRecord {
	
	private EmployeeType employeeType;
	private Date dateOfJoining;
	private String name;
	private String city;

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

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
	
	/**
	 * @return the employeeType
	 */
	public EmployeeType getEmployeeType() {
		return employeeType;
	}
	
	/**
	 * @param employeeType the employeeType to set
	 */
	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

}
