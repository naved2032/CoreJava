package oco.rays.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestStream {
	
	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList();
		
		list.add(450000);
		list.add(300000);
		list.add(200000);
		list.add(600000);
		list.add(450000);
		list.add(800000);
		list.add(650000);
		list.add(800000);
		
		
		list.forEach(System.out::println);
		
		System.out.println("------------------------");
		
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("--------------------------");
		
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		System.out.println("--------------------------");
		
		//list.stream().max(Integer::compare).ifPresent(System.out::println);
	
		list.stream().sorted(Collections.reverseOrder()).limit(1).forEach(System.out::println);
		
		System.out.println("---------------------------");
		
		list.stream().sorted().skip(1).limit(1).forEach(System.out::println);
		
		
		
	}
	
	
	

}
