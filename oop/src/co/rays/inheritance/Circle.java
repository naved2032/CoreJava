package co.rays.inheritance;

public class Circle extends Shape{

	
	private int radius ;
	
	
	public void setradius (int radius) {
		this.radius=radius;
	}
	
	public int getradius(int radius) {
		return radius;
		
	}
	
	public Double area(Double area) {
		return 3.14*radius*radius;
		
	}
	
	
	
}
