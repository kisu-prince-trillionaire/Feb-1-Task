package com.employee.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class EmployeeId implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private int age;

	public EmployeeId(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public EmployeeId() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "EmployeeId [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
