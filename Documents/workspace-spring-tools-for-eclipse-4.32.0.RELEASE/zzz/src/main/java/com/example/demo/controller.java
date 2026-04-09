package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class controller {
	@GetMapping("/welcome")
	public String getmessage() {
		return "welcome to docker hub pora puka";
	}

}
