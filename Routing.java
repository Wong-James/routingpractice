package com.james.routing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class Routing {
	@RequestMapping("")
	public String Coding() {
		return "Hello Coding Dojo";
	}
	@RequestMapping("/python")
	public String Python() {
		return "Python/Django was awesome!";
		}
	@RequestMapping("/java")
	public String Java() {
		return "Java/Spring is better yes! OIWJFEOIWEFJ";
	}
}

