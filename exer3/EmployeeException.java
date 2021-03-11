package com.cg.eis.exception;

public class EmployeeException extends Exception {
  
	int salary;

	public EmployeeException(int salary) {
		super();
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeException [salary=" + salary + "]";
	}

	
}
