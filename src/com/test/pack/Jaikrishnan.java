package com.test.pack;

import java.util.LinkedHashMap;
import java.util.Map;

public class Jaikrishnan {

	public static void main(String[] args) {

		String s = "India was a slave country before 1947 by the British Rule for many years. However, after many years of hard struggle of ";		
		String[]  J = s.split(" ");
		Map<String,Integer>rep=new LinkedHashMap<String, Integer>()	;	
		for(String H:J) {		
		if(rep.containsKey(H)){
		int count=rep.get(H);	
		count++;		
		rep.put(H,count);
		}		
		else {		
			rep.put(H, 1);
		}}
		System.out.println(rep);
		}
		
	}
