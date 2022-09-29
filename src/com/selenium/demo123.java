package com.selenium;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class demo123 {
	public static void main(String[] args) {
		String s=("for the people off the people by the people");
		String[] allwords = s.split(" ");
	//	map<wapperclass>ref name= new hashmap <wapperclass>();
		Map<String,Integer>n=new LinkedHashMap<String,Integer>();
		for (String word : allwords) {
			if(n.containsKey(word)) {
				Integer value=n.get(word);
				n.put(word, value+1);
			}
			else
			{
				n.put(word, 1);
			}
		//	System.out.println(n);
		}
		//System.out.println(n);//out side 
		
		Set<Entry<String, Integer>> entryset = n.entrySet();//
		for (Entry<String, Integer> smart : entryset) {
			if(smart.getValue()>1) {
			System.out.println(smart);
			
		}
		
	}
		
	}
}
   
			
	
		
		
