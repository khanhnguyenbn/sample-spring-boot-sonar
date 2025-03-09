package com.example.sample_spring_boot_sonar;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;


@Slf4j
@SpringBootTest
public class FirstDuplicateTest {
    
    @Test
    void testDuplicate1() {
        // Đoạn code trùng lặp thứ nhất
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

    @Test
    void testDuplicate2() {
        // Copy của đoạn code trên
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
