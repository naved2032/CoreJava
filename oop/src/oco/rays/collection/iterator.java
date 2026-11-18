package oco.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
	
	public static void main(String[] args) {
		
	
	
  ArrayList a= new ArrayList();
   
    a.add("naved");
    a.add("nasir");
    a.add("kashif");
    a.add("aayush");
    a.add("ishan");
    a.add("suleman");
    a.add("parvex");
    
    System.out.println(a);
    
    Iterator it= a.iterator();
    
    while(it.hasNext()) {
    	//.hasnext method returns boolean data type
    	//System.out.print(it.next()+ ",");
    	//.next returns the next element
    	Object o = it.next();
    	//System.out.println(o);
    	
    	if(o.equals("kashif")) {
    		it.remove();
    		
    	}
    	
    }
    
    System.out.println(a);
    	
    	
    }
    
    
    	}
    
       
    
    
    
	
	

