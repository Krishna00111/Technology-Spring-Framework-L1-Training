package com.seleniumexpress.test;

import com.seleniumexpress.api.Student;
import com.seleniumexpress.dao.StudentDAO;

public class Test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")
		System.out.println("application context loaded..");
		
		StudentDAOImpl studentDaoImple = context.getBean("studentDao", StudentDAOImpl.class);
		
		Student newStudent1 = new Student();
		newStudent1 = new Student(2);
		newStudent1.setName("Chinmay");
		newStudent1.setAddress("India");
		
		StudentDAO studentDAO = new StudentDAOImpl();
		studentDAO.insert(newStudent1);
		
	}

}
