package co.rays.oop;

public class TestAutomobile {
	
	
	public static void main(String[] args) {
		
		
		Automobile c1= new Automobile();
		
		
		c1.setcompany("TATA");
		c1.setcolour("Black");
		c1.setmodel(2025);
		c1.setspeed(40);
		
		
		System.out.println(c1.getcompany());
		System.out.println(c1.getcolour());
		System.out.println(c1.getmodel());
		//System.out.println(c1.getspeed());
		//c1.accelerator(20);
		c1.changegear(3);
		System.out.println(c1.getspeed());
	}

}
