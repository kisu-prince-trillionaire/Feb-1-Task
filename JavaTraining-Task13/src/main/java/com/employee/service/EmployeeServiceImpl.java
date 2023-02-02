package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;
import com.employee.entity.EmployeeId;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao empDao;

	@Override
	public List<Employee> getEmployee() {

		return (List<Employee>) empDao.findAll();
	}

	@Override
	public Employee getEmployeeById(EmployeeId id) {
		id.setId(id.getId());
		id.setName(id.getName());
		id.setAge(id.getAge());
		return empDao.findById(id).orElse(null);
	}

	@Override
	public Employee addEmployee(Employee employee) {

		return empDao.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		return empDao.save(employee);
	}

	@Override
	public String deleteEmployee(EmployeeId id) {
		id.setId(id.getId());
		id.setName(id.getName());
		id.setAge(id.getAge());
		empDao.deleteById(id);
		return "Employee Deleted";
	}

}
