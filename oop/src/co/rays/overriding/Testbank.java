package co.rays.overriding;

public class Testbank {
	
	public static void main(String[] args) {
		
		bank b=new bank();
		
		System.out.println("intrest of rbi= "+ b.getIntrest());
		System.out.println("name of bank= "+ b.getBankName());
		
		
		System.out.println("--------------------------------");
		
		SBI a1= new SBI();
		
		System.out.println("name of bank= "+ a1.getBankName());
		System.out.println("intrest of bank= "+ a1.getIntrest());
		
		System.out.println("----------------------------------");
		
		Axis b1= new Axis();
		
		System.out.println("name of bank= "+ b1.getBankName());
		System.out.println(("intrest of bank= "+ b1.getIntrest()));
		
	}

}
