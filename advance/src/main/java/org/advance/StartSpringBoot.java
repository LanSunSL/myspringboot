package org.advance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication  //=@EnableAutoConfiguration + @ComponentScan()
public class StartSpringBoot {

	public static void main(String[] args) {
		SpringApplication.run(StartSpringBoot.class, args);
	}

}
