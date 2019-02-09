package ques7_6.com.cg.eis.service;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

import ques7_6.com.cg.eis.bean.Employee;

public class EmployeeService {
	static int key = 101;
	Map<Integer, Employee> map = new HashMap<>();

	public void addEmployee(Employee emp) {
		map.put(key, emp);
		key++;
		
		System.out.println("Employee successfully added!!!");
	}
	
	public void showDetails(String insuranceScheme) {
		for(Entry<Integer, Employee> entry:map.entrySet()){    
//	        int key = entry.getKey();  
//	        Employee emp = entry.getValue();  
//	        System.out.println(emp.getId());
	        System.out.println("Details: \n-----------------\n");  
	        if(entry.getValue().getInsuranceScheme().equals(insuranceScheme)) {
	        	System.out.println(entry.getValue().getId() + entry.getValue().getName() + entry.getValue().getSalary() + entry.getValue().getDesignation()+"\n");   	        	
	        }
	    }  
	}
	
	public void deleteEmployee(int id) {
//		map.remove(id);
		System.out.println("Map after removed: ");
		System.out.println("Details: \n-----------------\n");  
		for(Entry<Integer, Employee> entry:map.entrySet()){    
//	        int key = entry.getKey();  
//	        Employee emp = entry.getValue();  
	        System.out.println(entry.getKey() + entry.getValue().getName() + entry.getValue().getSalary() + entry.getValue().getDesignation()+"\n");   	        	
	    }  		
	}
		
}
