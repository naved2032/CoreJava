package co.rays.overriding;

public class Triangle extends Shape{
	
	private int heigth;
	
	private int base;

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("area of triangle= "+ 1.5*base*heigth);
	}
	
	

}
