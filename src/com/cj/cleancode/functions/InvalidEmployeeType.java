/**
 * 
 */
package com.cj.cleancode.functions;

/**
 * @author CJ
 * Created on : 06-Sep-2017
 */
public class InvalidEmployeeType extends Exception {
	
	private static final long serialVersionUID = 9136757381198139089L;
	
	EmployeeType type;
	
	public InvalidEmployeeType(EmployeeType type) {
		super("invalid employee type :"+ type);
		this.type = type;
		
	}

}
