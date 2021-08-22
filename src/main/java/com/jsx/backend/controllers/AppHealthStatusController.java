package com.jsx.backend.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("actuator")
@AllArgsConstructor
public class AppHealthStatusController {
    @GetMapping(path="/health")
    public String health() {
        return "{\"status\": \"UP\"}";
    }
}
