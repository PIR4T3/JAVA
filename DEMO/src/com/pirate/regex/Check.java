package com.pirate.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String balance = "Shubham Kumar";
		String namePattern = "^[A-Za-z]{3,}$";
		Pattern pattern = Pattern.compile(namePattern);
		Matcher matcher = pattern.matcher(balance);
		if(matcher.find()) {
			System.out.println(matcher.group(0));			
		}
		else {
			System.out.println("Err");
		}
	}

}
