package co.rays.overriding;

public class Shape {

	protected String colour;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void area() {
		System.out.println("this is area of shape");
	}
	
}
