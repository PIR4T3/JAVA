package com.pirate.compareto;

import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(102,"Rahul",13000));
		list.add(new Employee(103,"Shubham",13500));
		list.add(new Employee(104,"Brajesh",14000));
		list.add(new Employee(105,"Yanshu",11000));
		
		Collections.sort(list,new CompareBySalary());
		
		for(Employee emp : list) {
			System.out.println(emp);
		}
		
	}

}
