package com.gontuseries.springcore;

public class TestSpringProject {
	
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXMlApplicationContext("SpringConfig.xml");
		Restaruant restaruantObj = (Restaurant) context.getBean("restaruantBean");
		
		restaruantObj.greetCustomer();
	}

}
