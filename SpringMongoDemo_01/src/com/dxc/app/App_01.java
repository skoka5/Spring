package com.dxc.app;

import java.text.ParseException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.dxc.AppllicationConfiguration;
import com.dxc.beans.Student;

public class App_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new AnnotationConfigApplicationContext(AppllicationConfiguration.class);
		
		MongoTemplate mongoTemplate =context.getBean(MongoTemplate.class);
		
		try {
			Student student =new Student(101,"karthik","21-12-1998","karthik@gmail.com","4615346");
			mongoTemplate.insert(student,"student");
			System.out.println("Document saved successfully");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of Program");
		

	}

}
