package com.demo.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.demo.bean.Student;

public class StudentDao {
	private HibernateTemplate template;

	@Transactional
	public int insertStudent(Student student) {
		int i = (Integer) this.template.save(student);
		return i;
	}

	public Student getStudent(int id) {
		Student student = this.template.get(Student.class, id);
		return student;
	}

	public List<Student> getStudents() {
		List<Student> student = this.template.loadAll(Student.class);
		return student;
	}

	@Transactional
	public void deleteStudent(int id) {
		Student student = this.template.get(Student.class, id);
		this.template.delete(student);
	}

	@Transactional
	public void updateStudent(Student student) {
		this.template.update(student);
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

}
