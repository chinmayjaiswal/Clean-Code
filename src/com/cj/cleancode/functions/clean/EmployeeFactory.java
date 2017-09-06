/**
 * 
 */
package com.cj.cleancode.functions.clean;

import com.cj.cleancode.functions.InvalidEmployeeType;

/**
 * @author CJ
 * Created on : 07-Sep-2017
 */
public interface EmployeeFactory {
	
	public Employee makeEmployee(EmployeeRecord record) throws InvalidEmployeeType;

}
