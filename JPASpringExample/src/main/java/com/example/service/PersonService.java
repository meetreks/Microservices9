package com.example.service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import com.example.model.Person;

@Service
public class PersonService {
	Hashtable<String,Person> persons = new Hashtable<String,Person>();
	public PersonService()
		{
		Person p = new Person();
		p.setAge(10);
		p.setFirstName("Sai");
		p.setLastName("Ram");
		p.setId("10");
		persons.put("10", p);
		
	}
	
	public Person getPerson(String id)
	{
		if(persons.containsKey(id))
			return persons.get(id);
		else
			
			return null;
	}
	
	public Hashtable<String,Person> getAll()
	{
		return persons;
	}
		
	}


