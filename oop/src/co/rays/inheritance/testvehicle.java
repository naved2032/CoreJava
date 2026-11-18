package co.rays.inheritance;

public class testvehicle {
	
	public static void main(String[] args) {
		
		
		car c= new car();
		
		c.setBrand("TATA");
		c.setSpeed(200);
		
		System.out.println("car brand is= "+ c.getBrand());
		System.out.println("top speed is= "+c.getSpeed());
		
		c.start();
		c.opentrunk();
		
		
		System.out.println("-------------------------------------");
		
		bus b= new bus();
		
		b.setBrand("Mahindra");
		b.setSpeed(120);
		
		System.out.println("bus brand is = "+ b.getBrand());
		System.out.println("top speed is= "+ b.getSpeed());
		
		b.pickpasangers();
		
		System.out.println("--------------------------------------"
				+ "");
		
		bike bi= new bike();
		
		bi.setBrand("Yamaha");
		bi.setSpeed(180);
		
		System.out.println("bike brand is= "+ bi.getBrand());
		System.out.println("top speed is= "+ bi.getSpeed());
		
		
		bi.start();
		bi.wheelie();
	}
	
	
	
	

}
