package org.advance.controller;

import javax.annotation.Resource;

import org.advance.service.IMessageService;
import org.advance.util.controller.AbstractBaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController extends AbstractBaseController{
	@Resource
	private IMessageService messageService;
	
	@RequestMapping("/show")
	public String show(String mid, Model model) {
		model.addAttribute("url", "www.helloworld.com");
		model.addAttribute("mid", mid);
		return "page/page_show";
	}
}
