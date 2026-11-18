package oco.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class Collection {
	
	public static void main(String[] args) {
		
		ArrayList s = new ArrayList();
		
		
		s.add(0,"naved");
		s.add(1, "nitin");
		s.add(2, "nasir");
		s.add(3, "nitesh");
		
		
		
		System.out.println(s);
		//System.out.println(s.remove(2));
		//System.out.println(s);
		System.out.println(s.set(0, "nasir"));
		System.out.println(s);
		
	}
	
	
	

}
