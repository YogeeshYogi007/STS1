package com.example.demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/catalog")
public class movie_cat_Resource {
	
	@GetMapping("/{userid}")
	public List<Catalogitem> getcatalog(@PathVariable("userid") String userid){
		
		RestTemplate resttemplate = new RestTemplate();
		List<Rating> ratings=Arrays.asList(
				new Rating("12324", 6),
				new Rating("63738", 3),
				new Rating("43636",4)
				);
		
		//return Collections.singletonList(new Catalogitem ("Transformer", "tdtd", 4));
		return  ratings.stream().map(r ->{
			Movie movie=resttemplate.getForObject("http://localhost:8081/movie"+Rating.getMovieid(),Movie.class);
		
		}).collect(Collectors.toList());
	}
	
		
}
