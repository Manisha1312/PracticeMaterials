package com.in28minutes.springboot.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28minutes.springboot.web.dao.IPersonDAO;
import com.in28minutes.springboot.web.dao.entity.Person;
import com.in28minutes.springboot.web.service.IPeopleService;

@Service
public class PeopleServiceImpl implements IPeopleService {

	@Autowired
	IPersonDAO personDao;
	
	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person findById(Integer id) {
		return personDao.findById(id);
	}

	@Override
	public Integer save(Person p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Person p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getIds() {
		// TODO Auto-generated method stub
		return null;
	}

}
