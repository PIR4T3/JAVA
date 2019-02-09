package com.pirate.ques7_5;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("abcd");
		list.add("fgte");
		list.add("syeui");
		list.add("admsu");
		list.add("sjkuie");
		
		Set<String> set = new TreeSet<>();
		
		for(String str : list) {
			set.add(str);
		}
		
		for(String str : set) {
			System.out.println(str);
		}
	}
}
