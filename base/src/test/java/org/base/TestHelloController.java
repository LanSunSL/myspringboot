package org.base;

import javax.annotation.Resource;

import org.base.controller.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import junit.framework.TestCase;

@SpringBootTest(classes=HelloController.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestHelloController {
	@Resource
	private HelloController helloController;
	@Test
	public void testHello() {
		TestCase.assertEquals(this.helloController.hello(), "hello world");
	}
}
