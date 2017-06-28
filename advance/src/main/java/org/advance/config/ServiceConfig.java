package org.advance.config;

import org.advance.service.impl.MessageServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
	@Bean
	public MessageServiceImpl getMessageService() {
		return new MessageServiceImpl();
	}
}
