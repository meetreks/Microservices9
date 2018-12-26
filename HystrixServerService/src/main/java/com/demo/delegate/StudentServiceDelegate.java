package com.demo.delegate;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class StudentServiceDelegate {
	@Autowired
	RestTemplate rt;
	
	@HystrixCommand(fallbackMethod = "callStudentServiceAndGetData_Fallback" )

	public String callStudentServiceAndGetData(String schoolname) {
		// TODO Auto-generated method stub
		System.out.println("Getting into this class" + schoolname);
		
		String response = rt.exchange("http://localhost:8098/getStudentDetailsFromSchool/{schoolname}",
							HttpMethod.GET,
							null, new ParameterizedTypeReference<String>()
							{},schoolname).getBody();
		System.out.println("Getting into this class99999" + schoolname);
		
		return schoolname + response;
	}
	@SuppressWarnings("unused")
	private String callStudentServiceAndGetData_Fallback(String schoolname) {
		// TODO Auto-generated method stub
		System.out.println("Gracious Exit from teh circuit breaker");
		
		return "great one" + new Date();
	}
	
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}

}
