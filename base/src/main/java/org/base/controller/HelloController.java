package org.base.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // = @Controller + @ResponseBody
public class HelloController {
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@RequestMapping("/echo")
	public String echo(String msg) {
		return "【ECHO】" + msg;
	}
	
	@RequestMapping(value = "/echo2/{message}", method=RequestMethod.GET)
	public String echo2(@PathVariable("message")  String msg) {
		return "【ECHO】" + msg;
	}
}
