package com.example.ace_dash.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping(value = "/api", headers = "Accept=application/json")
public class DashController {

      @GetMapping("/healthCheck")
        public String fetchAllUsers( ) {
        return "Dashboard up and running";
    }
    
}
