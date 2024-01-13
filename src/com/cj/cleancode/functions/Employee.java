/**
 *
 */
package com.cj.cleancode.functions;

/**
 * @author CJ Created on : 06-Sep-2017
 */
public class Employee {

  private String name;
  private String city;
  private EmployeeType type;

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

  public EmployeeType getType() {
    return type;
  }

  public void setType(EmployeeType type) {
    this.type = type;
  }

}
