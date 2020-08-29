package com.dxc.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dxc.beans.Product;
import com.dxc.service.ProductService;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext application = new ClassPathXmlApplicationContext("sping.xml");
		
		ProductService productService = application.getBean(ProductService.class);
		
		productService.add(new Product(101,"book",675.38));
		productService.add(new Product(102,"pencil",696.37));
		
		System.out.println(productService.findAll());
		
		application.close();
	}

}
