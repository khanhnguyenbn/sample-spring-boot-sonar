package com.example.sample_spring_boot_sonar;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class DuplicateController {
    
    @GetMapping("/duplicate")
    public List<String> duplicateMethod() {
        List<String> items = new ArrayList<>();
        
        // Copy chính xác đoạn code từ các service
        for (String item : items) {
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
                items.add(processed);
            }
        }
        
        return items;
    }
} 