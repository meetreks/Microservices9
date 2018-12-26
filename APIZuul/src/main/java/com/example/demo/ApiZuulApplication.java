package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.filter.ErrorFilter;
import com.example.filter.PostFilter;
import com.example.filter.PreFilter;
import com.example.filter.RouteFilter;
@EnableZuulProxy
@SpringBootApplication(scanBasePackages = {"com.example.filter"})
public class ApiZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiZuulApplication.class, args);
	}
	
	@Bean
	public PreFilter preFilter()
	{
		return new PreFilter();
	}
	
	@Bean
	public PostFilter postFilter()
	{
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter()
	{
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter()
	{
		return new RouteFilter();
	}
}
