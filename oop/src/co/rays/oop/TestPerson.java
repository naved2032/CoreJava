package co.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	
	public static void main(String[] args) throws ParseException {
		
		
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		
		Person p1= new Person();
		
		
		p1.setName("Naved");
		p1.setaddress("Indore");
		p1.setdob(sdf.parse("2005-11-27"));
		
		
		System.out.println(p1.getName());
		System.out.println(p1.getName());
		System.out.println(p1.getdob());
		System.out.println(p1.getAge());
		
	}

}
