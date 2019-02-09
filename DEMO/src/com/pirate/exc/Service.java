package com.pirate.exc;

public class Service {

	public String eligibleForVote(int age) throws Excep{
		if(age >= 18) {
			return "Yes";
		}
		throw new Excep();
	}
}
