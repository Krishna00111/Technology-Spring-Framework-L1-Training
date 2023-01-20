package com.gontuseries.springcore;

public class TestSpringProject {
	
	public static void main(String[] args) {
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Restaurant restaurantObj1 = (Restaurant) contxt.getBean("restaurantBean");
		restaurantObj1.setWelcomeNote("Object1 is setiing welcome note property");
		restaurantObj1.greetCustomer();
		
		Restaurant restaurantObj2 = (Restaurant) context.getBean("restaurantBean");
		restaurantObj2.greetCustomer();
	}

}
