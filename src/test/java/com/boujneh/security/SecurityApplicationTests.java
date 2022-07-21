package com.boujneh.security;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SecurityApplicationTests {

	static Logger logger= LoggerFactory.getLogger(SecurityApplicationTests.class);

	@Test
	void contextLoads() {

		logger.info("inside test class");
		logger.info("inside test class second test");
		Assertions.assertEquals(true,true);
	}

}
