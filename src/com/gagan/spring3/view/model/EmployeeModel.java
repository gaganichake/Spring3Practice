package com.gagan.spring3.view.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeModel {

	  private String username;
	  private String password;
	  private String name;
	  private String department;
	  private String rolename;
	  private String phone;
	  private String email;
	  private Integer depid;
	  private Integer roleid;
	  private EmployeeModel employee;
	  private List<EmployeeModel> employeeList;
	  
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getDepid() {
		return depid;
	}
	public void setDepid(Integer depid) {
		this.depid = depid;
	}
	public Integer getRoleid() {
		return roleid;
	}
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}
	public EmployeeModel getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeModel employee) {
		this.employee = employee;
	}
	public void setEmployeeList(List<EmployeeModel> employeeList) {
		this.employeeList = employeeList;
	}
	public List<EmployeeModel> getEmployeeList() {
		
		if(this.employeeList == null){
			this.employeeList = new ArrayList<EmployeeModel>();
		}
		return this.employeeList;
	}

}
