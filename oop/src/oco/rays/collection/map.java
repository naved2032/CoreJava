package oco.rays.collection;

import java.util.HashMap;
import java.util.Map;

//map is a interface that stores data in key-value pairs
//order of hashmap is not defined
//hashmap contains only one null value
//can not store duplicate value

public class map {

	public static void main(String[] args) {
		
	
	Map m= new HashMap();
	
	m.put("one", 1);
	m.put("two", 2);
	m.put("three", 3);
	m.put("four", 4);
	m.put("five", 5);
	
	
	
	System.out.println(m);
	System.out.println(m.get("three"));
    System.out.println(m.containsKey("one"));
    //value can be checked without " "
    System.out.println(m.containsValue(5));
    System.out.println(m.size());
	
	}

}
