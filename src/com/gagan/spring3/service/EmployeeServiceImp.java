package com.gagan.spring3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gagan.spring3.domain.Employee;
import com.gagan.spring3.service.interfaces.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		Employee employee  = new Employee();
		employee.setName("Sanjay");
		employee.setUsername("sanjay");
		employee.setPassword("sffsf");
		employee.setPhone("9065456787");
		employee.setEmail("sanjaym@gmail.com");
		employee.setRolename("role");
		employee.setDepartment("departmant");
		
		employeeList.add(employee);
		
		return employeeList;
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

}
