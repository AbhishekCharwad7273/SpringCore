package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		   ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/CollectionConfig.xml");
		   Student student1=(Student) context.getBean("student1");
		  
		   System.out.println(student1.getStudentName());
		   System.out.println(student1.getStudentPhones());	
		   System.out.println(student1.getStudentAddress());
		   System.out.println(student1.getStudentCourses());
	}

}
