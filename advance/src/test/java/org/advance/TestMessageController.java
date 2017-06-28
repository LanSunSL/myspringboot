package org.advance;

import javax.annotation.Resource;

import org.advance.controller.MessageController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import junit.framework.TestCase;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestMessageController {
	@Resource
	private MessageController messageController;
	@Test
	public void testInfo() {
		System.out.println(this.messageController.info());
		TestCase.assertEquals(this.messageController.info(), "www.helloworld.com");
	}
}
