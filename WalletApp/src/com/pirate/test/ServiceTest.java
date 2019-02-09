package com.pirate.test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.pirate.bean.Customer;
import com.pirate.bean.Wallet;
import com.pirate.exception.DuplicateIdException;
import com.pirate.repo.Repository;
import com.pirate.service.IWalletService;
import com.pirate.service.WalletService;

class ServiceTest {
	
	 @Before
	    public void runBeforeCreateTestMethod() {
	        System.out.println("run Before createAccount() Method");
	    }
	
	// createAcccount() Method Testing
	
	@Test
	void test1() throws DuplicateIdException {
		Customer customer = new Customer();
		Wallet wallet = new Wallet();
		IWalletService service = new WalletService(new Repository());
		customer.setName("Nonu");
		customer.setPhone("9808182359");
		customer.setWallet(wallet);
		wallet.setBalance(new BigDecimal(1200));
		
		assertEquals(customer, service.createCustomer("Nonu", "9808182359", new BigDecimal(1200)));
		
	}
	
	@Test
	void test2() throws DuplicateIdException {
		Customer customer = new Customer();
		Wallet wallet = new Wallet();
		IWalletService service = new WalletService(new Repository());
		customer.setName("Shubham");
		customer.setPhone("9808182359");
		customer.setWallet(wallet);
		wallet.setBalance(new BigDecimal(1200));
		
		assertEquals(customer, service.createCustomer("Shubham", "9808182359", new BigDecimal(1200)));
		
	}
	
	// showByphone() Method Testing
	
	void Test3() {
		Customer customer = new Customer();
		Wallet wallet = new Wallet();
		IWalletService service = new WalletService(new Repository());
		customer.setName("Nonu");
		customer.setPhone("9808182359");
		customer.setWallet(wallet);
		wallet.setBalance(new BigDecimal(1200));
		
		assertEquals(customer, service.showByPhone("9808182359"));
	}
	

}
