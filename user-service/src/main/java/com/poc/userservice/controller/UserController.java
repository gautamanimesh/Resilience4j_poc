package com.poc.userservice.controller;


import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    private int attempt = 1;

    @GetMapping("/displayOrders")
    @RateLimiter(name="processService", fallbackMethod = "processFallback")
    public ResponseEntity<String> displayOrders() {
        log.info("Method called {} time(s)", attempt++);
        return new ResponseEntity<>("Accepted!", HttpStatus.OK);
    }

    public ResponseEntity<String> processFallback(Exception exception) {
        log.error("eh!!! this is the error {}", exception.getMessage());
        return new ResponseEntity<>("Inside FallBack Method!", HttpStatus.TOO_MANY_REQUESTS);
    }
}