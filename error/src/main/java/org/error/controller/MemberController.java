package org.error.controller;

import java.util.Iterator;

import javax.validation.Valid;

import org.error.util.controller.AbstractBaseController;
import org.error.vo.Member;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController extends AbstractBaseController {
	@RequestMapping(value = "/addPre", method = RequestMethod.GET)
	public String addPre() {
		return "member_add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public Object add(@Valid Member vo, BindingResult result) {
		if (result.hasErrors()) {
			Iterator<ObjectError> iter = result.getAllErrors().iterator();
			while (iter.hasNext()) {
				ObjectError error = iter.next();
				System.out.println("【错误信息】code = " + error.getCode() + ", message = " + error.getDefaultMessage() );
			}
			return result.getAllErrors();
		} else {
			return vo;
		}
	}
	
	@RequestMapping("/div")
	@ResponseBody
	public String div() {
		System.out.println("除法计算： " +  10/0);
		return "www.helloworld.com";
	}
}
