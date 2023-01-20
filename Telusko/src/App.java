package com.navin.Telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
	Vehicle obj = (Vehicle)context.getBean("vehicle");
	obj.drive();

}
