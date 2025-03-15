package com.example.sample_spring_boot_sonar;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

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

		Random random = new Random();
		int testNumber = random.nextInt(10);
		log.info("testNumber: {}", testNumber);

	}

	@Test
	void test2() {
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

		Random random = new Random();
		int testNumber = random.nextInt(10);
		log.info("testNumber: {}", testNumber);
	}

	@Test
	void test3() {
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

		Random random = new Random();
		int testNumber = random.nextInt(10);
		log.info("testNumber: {}", testNumber);
	}

}
