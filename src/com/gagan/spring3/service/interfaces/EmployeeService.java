package com.gagan.spring3.service.interfaces;

import java.util.List;

import com.gagan.spring3.domain.Employee;

public interface EmployeeService {

	public List<Employee> getEmployee();
	
	public void addEmployee(Employee employee);
	
	public void deletEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);
}
