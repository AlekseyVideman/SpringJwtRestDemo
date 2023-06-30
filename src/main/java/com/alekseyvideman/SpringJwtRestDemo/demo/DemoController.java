package com.alekseyvideman.SpringJwtRestDemo.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping
    public ResponseEntity<String> demo() {
        return ResponseEntity.ok("Леди и джентельмены, приветствую вас на моём выступлении...");
    }
}
