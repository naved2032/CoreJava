package co.rays.inheritance;

public class TestAnimal {
	
	public static void main(String[] args) {
		
		Dog D= new Dog();
		
		D.setName("Tommy");
		D.setAge(4);
		
		D.eat();
		D.bark();
		
		System.out.println(D.getName());
		System.out.println(D.getAge());
		
		
		Cat c= new Cat();
		
		c.setName("shayala");
		c.setAge(2);
		c.eat();
		c.meow();
		System.out.println(c.getName());
		System.out.println(c.getAge());
		
		
		
		
		
	}
	
	

}
