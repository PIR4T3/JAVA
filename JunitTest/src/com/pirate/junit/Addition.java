package com.pirate.junit;

import java.io.FileInputStream;

public class Addition {
	public int addition(int a, int b) {
		return a+b;
	}
	
	public String[] input() {
		int i;
		String str = "";
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\SKUMA643\\Documents\\TextFiles\\addInput.txt");
			
			while((i=fin.read())!=-1) {
				str += (char)i;
			}
			System.out.println(str);
			fin.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
		
		String[] arr = str.split(" ");
		return arr;
	}
}
