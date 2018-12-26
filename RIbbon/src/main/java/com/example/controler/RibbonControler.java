package com.example.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonControler {
	@Autowired
	private RestTemplate temp;
	
	@RequestMapping("/")
	public String callService()
	{
		/* eurekhaservice is the service name which is binded in the services */
		return temp.getForEntity("http://eurekaservice", String.class).getBody();
	}

}
