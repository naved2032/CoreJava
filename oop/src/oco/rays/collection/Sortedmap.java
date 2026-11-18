package oco.rays.collection;

import java.util.SortedMap;
import java.util.TreeMap;

//treemap can not contain null value
//store data in sorted order of keys

public class Sortedmap {
	
	public static void main(String[] args) {
		
		SortedMap s= new TreeMap();
		
		s.put("one", 1);
		s.put("two", 2);
		s.put("three", 3);
		s.put("four", 4);
		s.put("five", 4);
		
		
		System.out.println(s);
		
		
		
		
	}

}
