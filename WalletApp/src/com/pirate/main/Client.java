package com.pirate.main;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.pirate.bean.Customer;
import com.pirate.exception.DuplicateIdException;
import com.pirate.exception.MobileNotFoundException;
import com.pirate.repo.Repository;
import com.pirate.service.IWalletService;
import com.pirate.service.WalletService;

public class Client {

	public static void main(String[] args) {
		IWalletService service = new WalletService(new Repository());
		
		Scanner scanner = new Scanner(System.in);
		char flag = 'Y';
		System.out.println("1. Create Account\n"
				+ "2. Show Balance\n"
				+ "3. Deposite Money\n"
				+ "4. Withraw Money\n"
				+ "5. Fund Transfer\n"
				+ "6. Show last 15 Transaction\n"
				+ "7. Exit\n");
		
		while(flag == 'Y') {
			System.out.print("Enter Choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter Mobile No: ");
				String mobile = scanner.nextLine();
				if(isMobileValid(mobile)) {
					System.out.println("Enter Name: ");
					String name = scanner.nextLine();
					if(isNameValid(name)) {
						System.out.println("Enter Openning Balance: ");
						String balanceStr = scanner.nextLine();
						if(isBalanceStrValid(balanceStr)) {
							BigDecimal balance = new BigDecimal(balanceStr);
							Customer customer;
							try {
								customer = service.createCustomer(name, mobile, balance);
								if(customer != null) {
									System.out.println("Acc. Created \n"
											+ "Detailes: \n"
											+ "-------------------------\n"
											+ "Mobile No: "+ customer.getPhone() +"\n"
											+ "Name: "+ customer.getName() +"\n"
											+ "Current Balance: Rs "+ customer.getWallet().getBalance() +"\n");	
								}
								else {
									System.out.println("Not Created");
								}
							} catch (DuplicateIdException e) {
								System.out.println(e);
							}
						}
						else {
							System.err.println("Balance Invalid");
						}
					}
					else {
						System.err.println("Wrong name");
					}
				}
				else {
					System.err.println("Wrong Mobile");
				}
				break;
				
			case 2:
				System.out.println("Enter Mobile No: ");
				String mobile1 = scanner.nextLine();
				if(isMobileValid(mobile1)) {
					Customer customer1;
					try {
						customer1 = service.showBalance(mobile1);
						System.out.println("Name: "+ customer1.getName()+"\n"
								+ "Your Current Balance is: "+ customer1.getWallet().getBalance()+"\n");
					} catch (MobileNotFoundException e) {
						System.out.println(e);
					}
				}
				break;
				
			case 3:
				System.out.println("Enter Mobile No: ");
				String mobile2 = scanner.nextLine();
				if(isMobileValid(mobile2)) {
					System.out.println("Enter Money to Deposite: ");
					String balanceStr1 = scanner.nextLine();
					if(isBalanceStrValid(balanceStr1)) {
						BigDecimal balance1 = new BigDecimal(balanceStr1);
						Customer customer2;
						try {
							customer2 = service.deposite(mobile2, balance1);
							
						} catch (MobileNotFoundException e) {
							System.out.println(e);
						}
					}
					
				}
				else {
					System.out.println("mobile err");
				}
				break;
				
				
			case 7:
				flag = 'N';
				break;
			}
		}		
		
	}

	private static boolean isMobileValid(String mobile) {
		String mobilePattern = "^[6-9][0-9]{9}$";
		Pattern pattern = Pattern.compile(mobilePattern);
		Matcher matcher = pattern.matcher(mobile);
		return matcher.matches();
	}
	
	private static boolean isNameValid(String name) {
		String namePattern = "^[A-Za-z\\s]{3,}$";
		Pattern pattern = Pattern.compile(namePattern);
		Matcher matcher = pattern.matcher(name);
		return matcher.matches();
	}
	
	private static boolean isBalanceStrValid(String balanceStr) {
		String balancePattern = "^\\d*$";
		Pattern pattern = Pattern.compile(balancePattern);
		Matcher matcher = pattern.matcher(balanceStr);
		return matcher.matches();		
	}

}
