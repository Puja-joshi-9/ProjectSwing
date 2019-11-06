package com.bway.swingdemo.service;

import java.util.List;

import com.bway.swingdemo.model.Employee;

public interface EmployeeService {
	
	boolean addEmployee(Employee emp);
	
	boolean deleteEmployee(int id);
	boolean updateEmployee(Employee emp);
	Employee getById(int id);
	
	List<Employee>getAllEmployee();
	
	List<Employee>searchEmployee(String input);
	
	

}
