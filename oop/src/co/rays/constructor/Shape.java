package co.rays.constructor;

public class Shape {
	
	protected String colour;
	protected int borderWidth;
	
	public Shape () {
		System.out.println("it is a default constructor");
	}
	
	
	public Shape(int borderWidth, String colour) {
		this();
		this.borderWidth=borderWidth;
		this.colour=colour;
		
		System.out.println(borderWidth);
		System.out.println(colour);
	}

}
