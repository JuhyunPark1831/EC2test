package com.example.EC2test.controller;


import com.example.EC2test.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("insert/{userName}")
    public ResponseEntity<?> insert(@PathVariable String userName) {
        return ResponseEntity.ok(testService.insertName(userName));
    }
    @GetMapping("find/{userId}")
    public ResponseEntity<?> find(@PathVariable Long userId) {
        return ResponseEntity.ok(testService.findName(userId));
    }
}
