package com.pirate.service;

import java.math.BigDecimal;

import com.pirate.bean.Customer;
import com.pirate.bean.Transaction;
import com.pirate.bean.Wallet;
import com.pirate.exception.DuplicateIdException;
import com.pirate.exception.MobileNotFoundException;
import com.pirate.repo.IRepository;

public class WalletService implements IWalletService {

	IRepository repo;

	public WalletService(IRepository repo) {
		super();
		this.repo = repo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pirate.service.IWallet#createCustomer(java.lang.String,
	 * java.lang.String, int, java.math.BigDecimal)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pirate.service.IWalletService#createCustomer(java.lang.String,
	 * java.lang.String, int, java.math.BigDecimal)
	 */
	@Override
	public Customer createCustomer(String name, String phone, BigDecimal balance) throws DuplicateIdException {
		Customer customer = new Customer();
		Wallet wallet = new Wallet();
		customer.setName(name);
		customer.setPhone(phone);
		customer.setWallet(wallet);
		wallet.setBalance(balance);
		if (repo.saveCustomer(customer)) {
			return customer;
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pirate.service.IWallet#showByPhone(java.lang.String)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pirate.service.IWalletService#showByPhone(java.lang.String)
	 */
	@Override
	public Customer showByPhone(String phone) {
		return repo.showByName(phone);
	}

	@Override
	public Customer showBalance(String phone) throws MobileNotFoundException {
		Customer customer = new Customer();
		return repo.findBalance(phone);
	}

	@Override
	public Customer deposite(String mobile2, BigDecimal balance1) throws MobileNotFoundException {
		Transaction transaction = new Transaction();
		Customer customer = new Customer();
		customer = repo.findBalance(mobile2);
		
		customer.getWallet().setBalance(customer.getWallet().getBalance().add(balance1));
		transaction.setId();
		transaction.setBalance(balance1);
		transaction.setMobile(mobile2);
		transaction.setTransactionType("Debit");
		repo.saveTransaction(customer.getPhone(),transaction);
		return null;
	}

}
