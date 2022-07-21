package com.boujneh.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class SecurityApplication {
    static Logger logger= LoggerFactory.getLogger(SecurityApplication.class);

	@PostConstruct
	public  void init()
	{
		logger.info("HBO Application starting...");
	}
	public static void main(String[] args) {

		logger.info("HBO Application executed...");
		SpringApplication.run(SecurityApplication.class, args);
	}

}
