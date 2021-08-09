package com.james.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dojo {
	@RequestMapping("/dojo/{dojo}")
	public String dojo(@PathVariable("dojo") String dojo) {
		return "The " + dojo + " is awesome!";
	}
	@RequestMapping("/burbank/{burbank}")
	public String burbankDojo(@PathVariable("burbank") String burbank) {
		return burbank + " Dojo is located in Southern California";
	}
	@RequestMapping("/sanjose/{sanjose}")
	public String sanJose(@PathVariable("sanjose") String sanjose) {
		return sanjose + " dojo is the headquarters";
	}

}
