package com.dxc.app;

import com.dxc.beans.Address;
import com.dxc.beans.Person;

public class App_02_noDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Address add1 = new Address(101, "SR-33", "RK Street", "Hyderabad");

      //Person person1 = new Person(101, "karthik","sai@gmail.com", "943545454", add1);
       Person person1 = new Person();
       person1.setId(101);
       person1.setName("karthik");
       person1.setEmail("sai@gmail.com");
       person1.setMobile("649634669");
       person1.setAddress(add1);
       
       System.out.println(person1);
       

	}

}
