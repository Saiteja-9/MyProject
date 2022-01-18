package com.emp.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("emp.xml");
		Employee emp = (Employee)context.getBean("employee");
		
		System.out.println(emp.getEname());
		System.out.println(emp.getAddress().getCity());
	}

}
 