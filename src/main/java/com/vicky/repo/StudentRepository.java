package com.vicky.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vicky.model.Student;

public interface StudentRepository 
extends JpaRepository<Student, Integer> {

}
