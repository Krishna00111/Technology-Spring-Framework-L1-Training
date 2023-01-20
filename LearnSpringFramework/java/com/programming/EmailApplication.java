package com.programming;

public class EmailApplication {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
		        new ClassPathXMlApplicationContext(configuration:"beans.xml");
		ApplicationContext.getBean(name:"emailClient", EmailClient", EmailClient.class);
		emailClient.sendEmail(emailMessage: "Hey, "+"This is my first email message.");
		emailClient.sendEmail(emailMessage:"Hey, " +"This is my second email message.");
//		
	}

}
