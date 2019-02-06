package com.pirate.repo;

import java.util.List;

import com.pirate.bean.Employee;

public interface RepositoryImpl {

	boolean save(Employee emp);

	List<Employee> searchByName(String name);

}