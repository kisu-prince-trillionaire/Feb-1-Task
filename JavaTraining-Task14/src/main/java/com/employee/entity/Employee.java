package com.employee.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Employee {
	@EmbeddedId
	private EmployeeId id;
	private long salary;
	private String jobTitle;
	private String gender;

	public Employee() {

	}

	public Employee(EmployeeId id, long salary, String jobTitle, String gender) {
		super();
		this.id = id;
		this.salary = salary;
		this.jobTitle = jobTitle;
		this.gender = gender;
	}

	public EmployeeId getId() {
		return id;
	}

	public void setId(EmployeeId id) {
		this.id = id;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", jobTitle=" + jobTitle + ", gender=" + gender + "]";
	}

}
