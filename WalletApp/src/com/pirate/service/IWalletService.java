package com.pirate.service;

import java.math.BigDecimal;

import com.pirate.bean.Customer;
import com.pirate.exception.DuplicateIdException;
import com.pirate.exception.MobileNotFoundException;

public interface IWalletService {

	/* (non-Javadoc)
	 * @see com.pirate.service.IWallet#createCustomer(java.lang.String, java.lang.String, int, java.math.BigDecimal)
	 */
	Customer createCustomer(String name, String phone, BigDecimal balance) throws DuplicateIdException;

	/* (non-Javadoc)
	 * @see com.pirate.service.IWallet#showByPhone(java.lang.String)
	 */
	Customer showByPhone(String phone);

	Customer showBalance(String phone) throws MobileNotFoundException;

	Customer deposite(String mobile2, BigDecimal balance1) throws MobileNotFoundException;

//	void ValidateCustomer(Customer customer);

//	void validateCustomer(Customer customer);

}