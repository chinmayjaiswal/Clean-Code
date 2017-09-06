/**
 * 
 */
package com.cj.cleancode.functions;

/**
 * @author CJ Created on : 06-Sep-2017
 */
public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Hodor");
		employee.setCity("WinterFell");
		employee.setType(EmployeeType.SALARIED);

		Payroll payroll = new Payroll();
		try {
			
			System.out.println("Calculated Pay for " + employee.getName() + " is " + payroll.calculatePay(employee));

		} catch (InvalidEmployeeType e) {
			// Log error
			System.err.println("An Error Occured :" + e.getMessage());
		}

	}

}
