package org.prog;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveStringWordOccurance {
public static void main(String[] args) {
	
	Map<String,Integer>m=new LinkedHashMap<>();
	
	String s="java is to to programming the the class Class to Taken taken by green green";
//	String remove=" ";
	
	String[] split = s.split(" ");
	
	for (int i = 0; i < split.length; i++) {
		
		         String w =split[i];
		         
		         
		         if(m.containsKey(w)) {
		        	
		         }
		         else
		         {
		        	 m.put(w, 1);
		         }
		         
		
	}
	
	Set<Entry<String, Integer>> entrySet = m.entrySet();
	for (Entry<String, Integer> entry : entrySet) {
if(entry.getValue()>1) {
	System.out.println(entry.getKey());
}
	}
	
}
}
