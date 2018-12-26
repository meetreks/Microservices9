package com.demo.controller;

import com.example.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServiceController {
	private static Map<String, List<Student>> schooDB = new HashMap<String, List<Student>>();
	static {
		schooDB = new HashMap<String, List<Student>>();
		List<Student> lst = new ArrayList<Student>();
		Student std = new Student("sai", "class9");
		lst.add(std);
		schooDB.put("saischool", lst);
		
		/*schooDB = new HashMap<String, List<Student>>();*/
		List<Student> lst1 = new ArrayList<Student>();
		Student std1 = new Student("sai1", "class99");
		lst1.add(std1);
		schooDB.put("saischool1", lst1);
		
		}
	
	@RequestMapping(value="/getStudentDetailsFromSchool/{schoolname}",method=RequestMethod.GET)
	public List<Student> getStudent(@PathVariable String schoolname)
	{
		System.out.println("Getting Student details for" + schoolname);
		
		List<Student> stdlst = schooDB.get(schoolname);
		if (stdlst == null)
		{
			stdlst = new ArrayList<Student>();
			Student std = new Student("Not Found", "NA");
			stdlst.add(std);
		}
		return stdlst;
		
	}

}
