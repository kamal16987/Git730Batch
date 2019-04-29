package com.test.pack;

import java.util.HashMap;
import java.util.Map;

public class Jash {
	
	
	
		public static void main(String[] args)
	    {
	        String blogName = "jaswanth annamreddy";
	        char[] chars = blogName.toCharArray();
	         
	        Map<Character, Integer> map = new HashMap<>();
	        for(char c : chars)
	        {
	            if(map.containsKey(c)) {
	                int counter = map.get(c);
	                map.put(c, ++counter);
	            } else {
	                map.put(c, 1);
	            }
	        }
	         
	        System.out.println("Duplicate characters:");
	         
	        //Print duplicate characters
	        for(char c : map.keySet()) {
	            if(map.get(c) > 1) {
	                System.out.println(c);
	            }
	        }
	    }
	}


