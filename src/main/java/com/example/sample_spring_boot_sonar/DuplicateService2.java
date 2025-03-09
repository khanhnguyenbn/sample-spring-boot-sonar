package com.example.sample_spring_boot_sonar;

import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class DuplicateService2 {
    
    public List<String> handleData(List<String> data) {
        List<String> results = new ArrayList<>();
        
        for (String item : data) {
            // Copy chính xác đoạn code từ DuplicateService1
            String processed = item.trim().toLowerCase();
            if (processed.length() > 5) {
                processed = processed.substring(0, 5);
            }
            
            if (!processed.isEmpty()) {
                if (processed.startsWith("a")) {
                    processed = "prefix_" + processed;
                } else if (processed.startsWith("b")) {
                    processed = "suffix_" + processed;
                } else {
                    processed = "middle_" + processed;
                }
                
                log.info("Processing item: {}", processed);
                results.add(processed);
            }
        }
        
        return results;
    }
} 