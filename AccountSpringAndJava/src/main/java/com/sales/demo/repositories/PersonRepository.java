package com.sales.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sales.demo.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {}