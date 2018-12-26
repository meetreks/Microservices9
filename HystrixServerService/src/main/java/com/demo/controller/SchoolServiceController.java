package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.delegate.StudentServiceDelegate;

@RestController
public class SchoolServiceController {
	
	@Autowired
	StudentServiceDelegate stdel;
	
	@RequestMapping(value = "/getSchoolDetails/{schoolname}", method = RequestMethod.GET)
	public String getStudents(@PathVariable String schoolname)
	{	
		System.out.println("Sai Rammm");
		return stdel.callStudentServiceAndGetData(schoolname);
		
		
	}
}
