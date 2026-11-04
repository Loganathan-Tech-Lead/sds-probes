package com.example.sds;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

/** Entry point for the "Probes" demo. Replace with the real implementation (see TODO.md). */
@RestController
public class ProbesController {
    @GetMapping("/demo/probes")
    public Map<String, String> demo() {
        return Map.of("concept", "Probes", "status", "scaffold - implement me");
    }
}
