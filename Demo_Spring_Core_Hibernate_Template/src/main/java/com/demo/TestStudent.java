package com.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.Student;
import com.demo.dao.StudentDao;

public class TestStudent {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao dao = (StudentDao) context.getBean("sdao", StudentDao.class);

		// Insert into student
		Student student1 = new Student(103, "Rahul Kumar", "Patna");
		int status1 = dao.insertStudent(student1);
		System.out.println(status1);

		// Update Into Student
		Student student2 = new Student(103, "Rahul Kumar", "Patna");
		dao.updateStudent(student2);

		// Delete student
		dao.deleteStudent(105);

		// get single student
		Student student3 = dao.getStudent(103);
		System.out.println(student3);

		// get students
		List<Student> students = dao.getStudents();
		System.out.println(students);

		((AbstractApplicationContext) context).close();
	}

}
