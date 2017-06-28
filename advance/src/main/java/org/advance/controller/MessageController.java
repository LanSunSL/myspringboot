package org.advance.controller;

import javax.annotation.Resource;

import org.advance.service.IMessageService;
import org.advance.util.controller.AbstractBaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // = @Controller + @ResponseBody
public class MessageController extends AbstractBaseController{
	@Resource
	private IMessageService messageService;
	@RequestMapping("/info")
	public String info() {
		return this.messageService.info();
	}
	@RequestMapping("/msg")
	public String getMessage(String mid) {
		System.out.println("【*** 访问地址 ***】" + super.getMessage("member.add.action"));
		System.out.println(super.getMessage("welcome.url"));
		System.out.println(super.getMessage("welcome.msg", mid));
		
		return super.getMessage("welcome.msg", mid);
	}
	
}
