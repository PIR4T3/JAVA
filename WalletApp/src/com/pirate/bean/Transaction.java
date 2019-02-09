package com.pirate.bean;

import java.math.BigDecimal;

public class Transaction {
	
	private static int idGenerator = 6341;
	private int id;
	private String mobile;
	private BigDecimal balance;
	private String TransactionType;
	
	public static int getCount() {
		return idGenerator;
	}
	public static void setCount(int count) {
		Transaction.idGenerator = count;
	}
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = idGenerator++;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public String getTransactionType() {
		return TransactionType;
	}
	public void setTransactionType(String transactionType) {
		TransactionType = transactionType;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((TransactionType == null) ? 0 : TransactionType.hashCode());
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		result = prime * result + id;
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		if (TransactionType == null) {
			if (other.TransactionType != null)
				return false;
		} else if (!TransactionType.equals(other.TransactionType))
			return false;
		if (balance == null) {
			if (other.balance != null)
				return false;
		} else if (!balance.equals(other.balance))
			return false;
		if (id != other.id)
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		return true;
	}
	
	
	
}
