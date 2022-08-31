package org.prog;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringWordOccurance {
public static void main(String[] args) {
	
	Map<String,Integer>m=new LinkedHashMap<>();
	
	String s="java is to to programming the the class Class to Taken taken by green green";
	
	
	String[] split = s.split(" ");
	
	for (int i = 0; i < split.length; i++) {
		
		         String w =split[i];
		         
		         
		         if(m.containsKey(w)) {
		        	 Integer x = m.get(w);
		        	 m.put(w, x+1);
		         }
		         else
		         {
		        	 m.put(w, 1);
		         }
		         
		
	}
	
	System.out.println(m);
}
}


