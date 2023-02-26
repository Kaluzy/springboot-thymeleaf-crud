package com.kaluzy.springboot.service;

import java.util.List;

import com.kaluzy.springboot.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void addEmployee(Employee employee);
	public Employee  getEmployeeById(long id);
	public void deleteEmployeeById(long id);
}
