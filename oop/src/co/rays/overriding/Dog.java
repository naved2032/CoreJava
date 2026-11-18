package co.rays.overriding;

public class Dog extends Animal{
	
	@Override
	public String getfood() {
		// TODO Auto-generated method stub
		return "dog eats dog food";
		
	}

	@Override
	public String getvoice() {
		// TODO Auto-generated method stub
		return "dog barks";
	}
}
