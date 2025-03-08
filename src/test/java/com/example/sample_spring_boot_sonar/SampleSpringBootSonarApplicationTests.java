package com.example.sample_spring_boot_sonar;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SampleSpringBootSonarApplicationTests {

	@Test
	void contextLoads() {
		log.info("test duplicated code");
		log.info("test duplicated code");
		log.info("test duplicated code");
		log.info("test duplicated code");
		log.info("test duplicated code");
		log.info("test duplicated code");
		log.info("test duplicated code");
		log.info("test duplicated code");
		log.info("test duplicated code");
		log.info("test duplicated code");
		log.info("test duplicated code");
		log.info("test duplicated code");
	}

}
