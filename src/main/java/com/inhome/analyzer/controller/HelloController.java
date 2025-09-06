package com.inhome.analyzer.controller;

import com.inhome.analyzer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/showHello")
    public ResponseEntity<Map<String, String>> showHello() {
        Map<String, String> response = new HashMap<>();
        response.put("message", helloService.getHelloMessage());
        return ResponseEntity.ok(response);
    }
}

