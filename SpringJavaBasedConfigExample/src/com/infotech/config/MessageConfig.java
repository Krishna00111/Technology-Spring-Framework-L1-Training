package com.infotech.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import com.infotech.model.Message;

public class MessageConfig {
	
	@Bean(name=("message"), autowire=Autowire.BY_NAME)
	public Message getMessage() {
		return new Message();
	}

}
