package com.test.pack;

import java.util.HashMap;

public class Geetha {

	public static void main(String args[]) {
		
			String s = "welcome to java class sql and java";
				String[] s1 = s.split(" ");
				HashMap<String, Integer> emp = new HashMap<String,Integer>();
				for (String c : s1) {
				if (emp.containsKey(c)) {
				int x = emp.get(c);
				emp.put(c, x + 1);
				} else {
				emp.put(c, 1);
				
				}
				
				}
				System.out.println(emp);
				
				}
}		
		
			
		
