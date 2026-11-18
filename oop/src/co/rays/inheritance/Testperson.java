package co.rays.inheritance;

import java.time.LocalDate;

public class Testperson {

	public static void main(String[] args) {
		
		
		Bussinessman a1= new Bussinessman();
		
		a1.setName("ayushi");
		a1.setAddress("indore");
		a1.setIncome(20000.00);
		a1.setDob(LocalDate.of(2005, 11, 20));
		
		System.out.println("Name = "+a1.getName());
		System.out.println("Address = "+a1.getAddress());
		System.out.println("Income = "+a1.getIncome());
		System.out.println("Date of Birth = "+a1.getDob());
		
		
		
		System.out.println("--------------------------------");
		
		Doctor d = new Doctor();
		
		d.setName("naved");
		d.setAddress("indore");
		d.setRegnumber("A1654");
		d.setDob(LocalDate.of(2006, 2, 20));
		
		
		System.out.println("Name = "+d.getName());
		System.out.println("Address = "+d.getAddress());
		System.out.println("Registration number ="+d.getRegnumber());
		System.out.println("Date of Birth = "+d.getDob());
		
		
		System.out.println("-----------------------------------");
		
		
		
		Student s= new Student();
		
		s.setName("kashif");
		s.setAddress("indore");
		s.setRollno("CS24");
		s.setMarks(84);
		s.setDob(LocalDate.of(2005, 11, 20));
		
		
		System.out.println("Name = "+s.getName());
		System.out.println("Address = "+s.getAddress());
		System.out.println("Roll number ="+s.getRollno());
		System.out.println("Marks= "+s.getMarks());
		System.out.println("Date of Birth = "+s.getDob());
	}
}
