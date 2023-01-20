package com.infotech.client;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("Beans.xml);")
        		
        Communication communication = ctx.getBean("communication", Communication.class);
        
        communication.communicate();
        
        ctx.close();
	}

}
