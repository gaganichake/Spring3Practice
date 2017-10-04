package com.gagan.spring3.view.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gagan.spring3.domain.Employee;
import com.gagan.spring3.service.interfaces.EmployeeService;
import com.gagan.spring3.view.model.EmployeeModel;

@Controller
@RequestMapping(value = "/Employee")
public class EmployeeController {

	private EmployeeService employeeService;
	
	public EmployeeController() {
		super();		
	}
	
	@Autowired
	public EmployeeController(EmployeeService employeeService){
		this.employeeService = employeeService;
	}
	/*
	 * Default method.
	 * Default method type is RequestMethod.GET in @RequestMapping.
	 */
	@RequestMapping
	public String listEmployee(Model model){
		
		List<Employee> employeeList = employeeService.getEmployee();
		
		EmployeeModel employeeModel = new EmployeeModel();
		
		for(Employee employee : employeeList){
			
			EmployeeModel employeeModel2 = new EmployeeModel();
			
			employeeModel2.setName(employee.getName());
			employeeModel2.setUsername(employee.getUsername());
			employeeModel2.setPassword(employee.getPassword());
			employeeModel2.setPhone(employee.getPhone());
			employeeModel2.setEmail(employee.getEmail());
			employeeModel2.setDepartment(employee.getDepartment());
			employeeModel2.setRolename(employee.getRolename());
			
			employeeModel.getEmployeeList().add(employeeModel2);
		}
		
		model.addAttribute("employeeModel", employeeModel);
		
		return "listEmployee";
	}
	
	/*
	 * Show full information of selected emplyee along with employee list.  
	 */
	@RequestMapping(value ="/Show", method = RequestMethod.GET)
	public String showEmployee(Model model){
		
		List<Employee> employeeList = employeeService.getEmployee();
		
		EmployeeModel employeeModel = new EmployeeModel();
		
		for(Employee employee : employeeList){
			
			EmployeeModel employee2 = new EmployeeModel();
			
			employee2.setName(employee.getName());
			employee2.setUsername(employee.getUsername());
			employee2.setPassword(employee.getPassword());
			employee2.setPhone(employee.getPhone());
			employee2.setEmail(employee.getEmail());
			employee2.setDepartment(employee.getDepartment());
			employee2.setRolename(employee.getRolename());
			
			employeeModel.getEmployeeList().add(employee2);
		}
				
		employeeModel.setEmployee(employeeModel.getEmployeeList().get(0));
		
		model.addAttribute("employeeModel", employeeModel);
		
		return "listEmployee";
	}
	
	@RequestMapping(value ="/Add", method = RequestMethod.GET)
	public String addEmployeeForm(){
		return "addEmployee";
	}
	
	@RequestMapping(value ="/Add", method = RequestMethod.POST)
	public String addEmployee(){
		return "redirectEmployeeList";
	}
}
