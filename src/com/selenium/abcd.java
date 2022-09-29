package com.selenium;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class abcd {
	public static void main(String[] args) {
		String s = ("for the people off the people by the people");
		String[] allWords = s.split(" ");
		Map<String, Integer> m = new HashMap<String, Integer>();
		for (String word : allWords) {
			if (m.containsKey(word)) {
				Integer value = m.get(word);
				m.put(word, value + 1);
			} else {
				m.put(word, 1);
			}
		}
		System.out.println(m);
		
		Set<Entry<String, Integer>> entrySet = m.entrySet();
			for (Entry<String, Integer> entry : entrySet) {
				if (entry.getValue() > 1) {
				System.out.println(entry);
			}

		}
	}
}
