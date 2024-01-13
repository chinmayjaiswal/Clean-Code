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

	/**
	 * This code has several problems. 
	 * payroll.calculatePay() 
	 * 		1. It's large, and when new employee types are added, it will grow.
	 * 		2. It clearly does more than one thing
	 * 		3. It violates SRP (Single Responsibility Principle) because there are more than one reason to change it.
	 * 		4. It violates OCP(Open Close Principle) because it must change when new employee types are added
	 *      5. There can be many functions that will have same structure  like : isPayday(Employee e, Date date)... 
	 */
	
}
