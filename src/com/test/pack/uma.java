package com.test.pack;

import java.util.LinkedHashMap;
import java.util.Map;


public class uma {
	public static void main(String[] args) {
		String s = "It deals only with grammar and is not a general course book.It is a grammar book";		
		String[]  X = s.split(" ");
		Map<String,Integer>rep=new LinkedHashMap<String, Integer>()	;	
		for(String V:X) {		
		if(rep.containsKey(V)){
		int count=rep.get(V);	
		count++;		
		rep.put(V,count);
		}		
		else {		
			rep.put(V, 1);
		}}
		System.out.println(rep);
		}}
