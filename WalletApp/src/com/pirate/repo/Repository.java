package com.pirate.repo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.pirate.bean.Customer;
import com.pirate.bean.Transaction;
import com.pirate.exception.DuplicateIdException;
import com.pirate.exception.MobileNotFoundException;

public class Repository implements IRepository {

	Map<String, Customer> map = new HashMap<>();
	/* (non-Javadoc)
	 * @see com.pirate.repo.IRepository#saveCustomer(com.pirate.bean.Customer)
	 */
	@Override
	public boolean saveCustomer(Customer customer) throws DuplicateIdException {
		if(map.containsKey(customer.getPhone())) {
			throw new DuplicateIdException();
		}
		map.put(customer.getPhone(), customer);
		System.out.println(map);
		return true;
	}
	/* (non-Javadoc)
	 * @see com.pirate.repo.IRepository#showByName(java.lang.String)
	 */
	@Override
	public Customer showByName(String phone) {
		for(Entry<String, Customer> entry:map.entrySet()) {
			if(entry.getValue().getPhone().equals(phone)) {
				return entry.getValue();
			}
		}
		return null;
	}
	@Override
	public Customer findBalance(String phone) throws MobileNotFoundException {
		if(map.containsKey(phone)) {
			return map.get(phone);
		}
		else {
			throw new MobileNotFoundException();			
		}
	}
	@Override
	public Customer saveTransaction(String phone, Transaction transaction) {
		
		
		return null;
	}
	
	
	
}
