package com.in28minutes.springboot.web.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.in28minutes.springboot.web.dao.IPersonDAO;
import com.in28minutes.springboot.web.dao.entity.Person;

@Transactional
@Repository
public class PersonDAOImpl implements IPersonDAO {
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Person> findAll() {
		List<Person> people = em.createQuery("select p from Person p", Person.class).getResultList();
		return people;
	}

	@Override
	public Person findById(Integer id) {
		Person person = em.find(Person.class, id);
		return person;
	}

	@Override
	public Integer save(Person p) {
		em.persist(p);
		return p.getId();
	}

	@Override
	public void delete(Person p) {
		em.remove(em.find(Person.class, p.getId()));
	}

	@Override
	public List<Integer> getIds() {
		List<Integer> ids = em.createQuery("select p.id from Person p", Integer.class).getResultList();
		return ids;
	}
}
