package com.pirate.exc;

public class Main {
	public static void main(String[] args) {
		String name = "Rakesh";
		int age = 17;
		Employee emp = new Employee();
		emp.setName(name);
		emp.setAge(age);
		
		Service serv = new Service();
		try {
			System.out.println(serv.eligibleForVote(emp.getAge()));			
		} catch(Excep e) {
			e.message();
		}
		
	}
}
