package com.infotech.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infotech.config.MessageConfig;

public class Test {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = null;
		
		try { 
			context = new AnnotationConfigApplicationContext(MessageConfig.class);
			
			Message message = context.getBean("getMessage", Message.class)
					System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(context != null)
				context.close();
		}
	}

}
