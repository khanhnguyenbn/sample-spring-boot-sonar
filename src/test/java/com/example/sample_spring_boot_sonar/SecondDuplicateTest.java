package com.example.sample_spring_boot_sonar;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

@Slf4j
@SpringBootTest
class SecondDuplicateTest {

    @Test
    void anotherTestWithDuplicate() {
        // Copy của đoạn code tương tự
        for (int i = 0; i < 5; i++) {
            log.info("Processing item {}", i);
            Random random = new Random();
            int value = random.nextInt(100);
            log.info("Generated value: {}", value);
            
            if (value > 50) {
                log.info("Value is greater than 50");
            } else {
                log.info("Value is less than or equal to 50");
            }
        }
    }
}
