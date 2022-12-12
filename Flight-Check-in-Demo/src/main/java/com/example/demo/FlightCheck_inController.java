package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Check-in")
public class FlightCheck_inController {

	@GetMapping("/{userid}")
	public String m1(@PathVariable("userid") String userid) {
		return "Welcome to Customer :"+ userid +"from Check-in";
	}
}
