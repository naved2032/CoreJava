package co.rays.inheritance;

public class Vehicle {
	
	protected String brand;
	
	protected int speed;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	public void start() {
		System.out.println("vehicle starts");
	}

	public void stop() {
		System.out.println("vehicle stops");
	}
}
