package com.in28minutes.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.in28minutes.springboot.web.dao.entity.Person;
import com.in28minutes.springboot.web.service.IPeopleService;

@Controller
public class PeopleController {


	@Autowired
	IPeopleService service;
	
	@GetMapping("person/{id}")
	public ResponseEntity<Person> getArticleById(@PathVariable("id") Integer id) {
		Person person = service.findById(id);
		return new ResponseEntity<Person>(person, HttpStatus.OK);
	}

	
}
