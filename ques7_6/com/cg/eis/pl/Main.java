package ques7_6.com.cg.eis.pl;

import java.util.*;

import ques7_6.com.cg.eis.bean.Employee;
import ques7_6.com.cg.eis.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		

		
		Scanner scan = new Scanner(System.in);
		
		
		
//		System.out.println(name + salary + designation + insuranceScheme);

		EmployeeService empServ = new EmployeeService();
		
		char flag = 'T';
		while(flag == 'T') {
			System.out.println("Enter Choice: ");
			int ch = scan.nextInt();
			switch(ch) {
				case 1: 
					System.out.print("Salary : ");
					double salary = scan.nextDouble();
					System.out.print("Employee Name: ");		
					String name = scan.next();
	//			scan.next();
					System.out.print("Insurance Scheme: ");
					String insuranceScheme = scan.next();
	//			scan.next();
					Employee emp = new Employee(name, insuranceScheme);
					empServ.addEmployee(emp);
					break;
				
				case 2: 
					System.out.println("Enter Insurance Scheme: ");
//					scan.next();
					String insScheme = scan.next();
					empServ.showDetails(insScheme);
					break; 
					
				case 3: 
					System.out.println("Enter Id: ");
					empServ.deleteEmployee(scan.nextInt());
					break;
//		case 4: sort(empList);
//		break;
				case 5: flag = 'F';
				break;
				
			}			
		}
		
		

	}

}



