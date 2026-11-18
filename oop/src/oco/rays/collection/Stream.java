package oco.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class Stream {
	
//stream is a series of objects 
//stream performs intermidiate operations
	
	public static void main(String[] args) {
		
		List <Integer> list= new ArrayList();
		
		for(int i=1; i<=10; i++) {
			list.add(i);
			
			
		}
		
		//System.out.println(list);
		
		list.forEach(System.out::println);
		
		System.out.println("--------------------------------");
		
		list.stream().filter(i-> i%2==0).forEach(System.out::println);
		
		System.out.println("--------------------------------");
		
		list.stream().filter(i -> i%2 !=0).forEach(System.out::println);
		
		System.out.println("--------------------------------");
		
		
		
		
		
		
		
	}

}
