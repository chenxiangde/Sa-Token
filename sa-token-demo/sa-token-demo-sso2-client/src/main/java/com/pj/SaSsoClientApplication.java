package com.pj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SaSsoClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaSsoClientApplication.class, args);
		System.out.println("Sa-Token SSO模式二 Client端启动成功");
	}
	
}