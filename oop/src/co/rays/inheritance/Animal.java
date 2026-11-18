package co.rays.inheritance;

public class Animal {
	
	protected String name;
	
	protected int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println("Animal eats");
	}
	public void sleep() {
		System.out.println("Animal sleeps");
	}
	
	

}
