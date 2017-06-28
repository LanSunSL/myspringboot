package org.base.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	
	@RequestMapping("/object")
	public String object(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("*** 客户端IP地址：" + request.getRemoteAddr());
		System.out.println("*** 取得客户端响应编码：" + response.getCharacterEncoding());
		System.out.println("*** 取得SessionID：" + request.getSession().getId());
		System.out.println("*** 取得真实路径：" + request.getServletContext().getRealPath("/upload/"));
		return "www.helloworld.com";
	}
}
