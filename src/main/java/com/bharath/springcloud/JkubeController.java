package com.bharath.springcloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JkubeController {
	@GetMapping("/hello")
	public String hello() {
		return "JKube is cool!";
	}

}
