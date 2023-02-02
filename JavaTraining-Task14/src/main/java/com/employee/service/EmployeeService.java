package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;
import com.employee.entity.EmployeeId;

public interface EmployeeService {

	public List<Employee> getEmployee();

	public Employee getEmployeeById(EmployeeId id);

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public String deleteEmployee(EmployeeId id);
}
