package com.backendtiss.tiss.controller;

import com.backendtiss.tiss.model.Test;
import com.backendtiss.tiss.service.TestService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TestController {
    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/test")
    public ResponseEntity<List<Test>> getAllTests() {
        List<Test> test = testService.getAllTests();
        return ResponseEntity.ok(test);
    }

    @GetMapping("/test/{id}")
    public ResponseEntity<Test> getTestById(@PathVariable Integer id) {
        Optional<Test> test = testService.getTestById(id);
        return test.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/create/test")
    public ResponseEntity<Test> createTest(@Valid @RequestBody Test test) {
        System.out.println(test);
        Test createdTest = testService.createTest(test);
        return ResponseEntity.ok(createdTest);
    }
}
