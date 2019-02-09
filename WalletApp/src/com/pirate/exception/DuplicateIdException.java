package com.pirate.exception;

public class DuplicateIdException extends Exception{

	@Override
	public String toString() {
		return "Customer Already Exists!!\n";
	}

	
}
