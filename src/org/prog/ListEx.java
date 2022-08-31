package org.prog;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class ListEx {
public static void main(String[] args) {
	List li = new LinkedList();
	li.add(78);
	li.add("ghh");
	li.add(8);
	li.add(78);
//	ListIterator listIterator = li.listIterator(2);
//	while (listIterator.hasNext()) {
//		Object object = (Object) listIterator.next();
//		System.out.println(object);
//	}
//	
	Spliterator spliterator = li.spliterator();
	System.out.println();
	
}
}
