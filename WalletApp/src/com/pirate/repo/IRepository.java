package com.pirate.repo;

import com.pirate.bean.Customer;
import com.pirate.bean.Transaction;
import com.pirate.exception.DuplicateIdException;
import com.pirate.exception.MobileNotFoundException;

public interface IRepository {

	boolean saveCustomer(Customer customer) throws DuplicateIdException;

	Customer showByName(String phone);

	Customer findBalance(String phone) throws MobileNotFoundException;

	Customer saveTransaction(String phone, Transaction transaction);

}