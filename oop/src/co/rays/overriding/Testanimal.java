package co.rays.overriding;

public class Testanimal {

	
	public static void main(String[] args) {
		
		Animal a= new Animal();
		
		System.out.println(a.getfood());
		System.out.println(a.getvoice());
		
		System.out.println("---------------------------------")
		
		;
		
		
		Dog d= new Dog();
		
		System.out.println(d.getfood());
		System.out.println(d.getvoice());
		
		System.out.println("---------------------------------");
		
		
	    Cat c= new Cat();
	    System.out.println(c.getfood());
	    System.out.println(c.getvoice());
	    
	    System.out.println("---------------------------------------");
	    
	    
	    Tiger t= new Tiger();
	    System.out.println(t.getfood());
	    System.out.println(t.getvoice());
	}
}
