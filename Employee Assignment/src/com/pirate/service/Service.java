package com.pirate.service;

import java.util.List;

import com.pirate.bean.Address;
import com.pirate.bean.Employee;
import com.pirate.repo.RepositoryImpl;

public class Service implements ServiceImpl {
	
	RepositoryImpl repo;
	public Service(RepositoryImpl repo) {
		super();
		this.repo = repo;
	}

	/* (non-Javadoc)
	 * @see com.pirate.service.ServiceImpl#createEmployee(int, java.lang.String, com.pirate.bean.Address)
	 */
	@Override
	public Employee createEmployee(int empId, String empName, Address address) {
		Employee emp = new Employee(empId, empName, address);
		
		if(repo.save(emp)) {
			return emp;
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see com.pirate.service.ServiceImpl#searchByName(java.lang.String)
	 */
	@Override
	public List<Employee> searchByName(String name){
		return repo.searchByName(name);
	}
}
