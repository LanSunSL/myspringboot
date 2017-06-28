package org.tomcat.service.impl;

import org.springframework.stereotype.Service;
import org.tomcat.service.IMessageService;
//import org.springframework.stereotype.Service;
@Service
public class MessageServiceImpl implements IMessageService {

	@Override
	public String info() {
		return "www.helloworld.com";
	}

}
