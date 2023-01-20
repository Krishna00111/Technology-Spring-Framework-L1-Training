package com.seleniumexpress.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.seleniumexpress.api.Student;

public class StudentDAOImpl {
	
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
	
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insert(Student student) {
		
		String sql = "INSERT INTO STUDENT VALUES(?,?,?)";
		
		Object[] arg {student.getRoolNo(),student.getName(),student.getAddress());
		
		int noOfRowInserted = jdbcTemplate.update(sql, org);
		
		System.out.println("No of row inserted is " + noOfRowInserted);
		}
		
		jdbcTemplate.update(sql, arg);
		
	}
		
	public DataSource getDataSource() {
		
		String url = "jdbc:mysql://127.0.0.1:3306/School?useSSL=false";
		String username = "root";
		String password = "qwerty@ROCKSTAR111";
	}
		
		DataSource dataSource = new DriverManagerDataSource(url, username, password)
				
		return dataSource; 

}
