package org.prog;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharOccurance {
	public static void main(String[] args) {
		Map<Character,Integer>m=new LinkedHashMap<>();
		
		String s ="arunpandian";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (m.containsKey(c)) {
				Integer x = m.get(c);
				m.put(c, x+1);
				 
			}
			else
			{
				m.put(c, 1);
			}
			
			
			
		}
		
		
		System.out.println(m);
		
		
		
	}

}
