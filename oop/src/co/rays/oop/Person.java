package co.rays.oop;

import java.util.Date;

public class Person {

	private String name;
	private Date dob;
	private String address;
	
	public final static int AGE=18;
	

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setdob(Date dob) {
		this.dob = dob;
	}

	public Date getdob() {
		return  dob;
		}
	public void setaddress(String address) {
		this.address = address;
		}
    
	public String getaddress() {
		return address;
		
	}
	
	
	public int getAge() {
		
		Date now= new Date();
		
		int age= now.getYear()-dob.getYear();
		return age;
	}
}
