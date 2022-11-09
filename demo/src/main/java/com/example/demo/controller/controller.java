package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
@RequestMapping("/home")
public String home() {
	return "index.jsp";
}
}
