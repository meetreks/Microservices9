package com.example.filter;

import org.springframework.context.annotation.Bean;

public class BeanFilter {

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
