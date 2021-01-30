package com.vicky.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vicky.model.Student;
import com.vicky.repo.StudentRepository;

@Component
public class DataInsertRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.save(
				new Student(66, "AA", 300.0, 
						new Date(),
						new Date(),
						new Date())
				);
	}

}
