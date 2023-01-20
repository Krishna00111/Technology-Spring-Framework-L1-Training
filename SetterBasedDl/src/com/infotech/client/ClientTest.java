package com.infotech.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.message.Communication;

public class ClientTest {

	 /** 
	  * @param args
	  */
	
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		Communication communication = ctx.getBean("communication", Communication.class);
		
		communication.communicate();
		
		ctx.close();
	}
}
