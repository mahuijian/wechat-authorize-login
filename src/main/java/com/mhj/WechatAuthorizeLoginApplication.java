package com.mhj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component("com.mhj.**")
@SpringBootApplication
public class WechatAuthorizeLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(WechatAuthorizeLoginApplication.class, args);
	}

}
