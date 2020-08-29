package com.dxc.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dxc.beans.Student;

public class App_01 {
	
	public static void main(String[] args) {
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
		Student student = (Student)ctxt.getBean("student");
		System.out.println(student);
	}

}
