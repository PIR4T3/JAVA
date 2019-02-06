package com.pirate.service;

import java.util.List;

import com.pirate.bean.Address;
import com.pirate.bean.Employee;

public interface ServiceImpl {

	Employee createEmployee(int empId, String empName, Address address);

	List<Employee> searchByName(String name);

}