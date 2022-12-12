package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
public class rating_data_resource {

	
	@GetMapping("/{movieid}")
	public Rating getRating(@PathVariable("movieid") String movieid) {
		return new Rating(movieid,5);
	}
}
