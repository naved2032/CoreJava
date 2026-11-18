package co.rays.constructor;

public class person {
	
	private String name;
	private int age;
	private String Addresss;
	
	
	public person (String name,int  age,String Address) {
		this.name=name;
		this.Addresss=Address;
		this.age=age;
	}
	
	public String getname() {
		return name;
	}
	
	public int getage() {
		return age;
		
	}
	
	public String getAddress() {
		return Addresss;
		
	}

}
