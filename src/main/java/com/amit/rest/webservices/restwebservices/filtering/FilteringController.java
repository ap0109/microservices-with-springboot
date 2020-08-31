package com.amit.rest.webservices.restwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {
	
	@GetMapping("/filtering")
	public SomeBean retieveSomeBean() {
		return new SomeBean("value1", "value2", "value3");
	}
	
	@GetMapping("/filtering-list")
	public List<SomeBean> retieveListOfSomeBean() {
		return Arrays.asList(new SomeBean("value1", "value2", "value3"),
				new SomeBean("value1", "value2", "value3"));
	}

}
