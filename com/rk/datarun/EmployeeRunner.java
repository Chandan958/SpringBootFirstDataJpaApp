package com.rk.datarun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rk.model.Employee;
import com.rk.repo.EmployeeRepository;


@Component
public class EmployeeRunner implements CommandLineRunner{
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Employee(101, "chandan", 20.0));
		
	}
	
}
