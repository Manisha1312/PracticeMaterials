package com.in28minutes.springboot.web.dao;

import java.util.List;

import com.in28minutes.springboot.web.dao.entity.Person;

public interface IPersonDAO {
    List<Person> findAll();
    Person findById(Integer id);
    Integer save(Person p);
    void delete(Person p);
    List<Integer> getIds();
}
