package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
//	private static int int insert;

	public static void main(String[] args) {
		System.out.println("my program started....");

		// Spring JDBC => JdbcTemplate using XML.
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

		//Spring JDBC => using Annotations.
		ApplicationContext context = new AnnotationConfigApplicationContext(JDBCConfig.class);
		
//		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
//		String query = "insert into student(id,name,city) values(?,?,?)";

		// fire the query;
//		int result = template.update(query, 156, "uttam kumar", "kanpur");
//		System.out.println("number of records inserted.." + result);

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		Student student = new Student();
		student.setId(156);
		student.setName("Sohan Kumar");
		student.setCity("Kashmir");
//	int result = studentDao.insert(student);
		int result = studentDao.change(student);
		System.out.println("student added : " + result);
	}
}
