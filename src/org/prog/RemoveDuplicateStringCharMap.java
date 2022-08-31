package org.prog;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicateStringCharMap {


	public static void main(String[] args) {
		Map<Character,Integer>m=new LinkedHashMap<>();
		
		String s ="arunpandian";
		String remove=" ";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (m.containsKey(c)) {
			
				 
			}
			else
			{
				m.put(c, 1);
			}
		}
		
		
Set<Entry<Character, Integer>> entrySet = m.entrySet();
		
for (Entry<Character, Integer> entry : entrySet) {
	remove =remove +entry.getKey();
	}
	System.out.println(remove);
}
		
	}


