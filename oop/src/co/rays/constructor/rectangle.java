package co.rays.constructor;

public class rectangle extends Shape {
	
	private int length;
	private int width;
	
	
	public rectangle(int length, int width,int borderWidth, String colour) {
		super(borderWidth,colour);
		this.length=length;
		this.width=width;
		
		System.out.println(length);
		System.out.println(width);
	}
	
	
	
	
	

}
