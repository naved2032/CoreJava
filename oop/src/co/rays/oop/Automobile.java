package co.rays.oop;

public class Automobile {

	private String colour;
	private int speed;
	private int model;
	private String company;
	
	public final static int NO_OFGEAR=6;

	public void setcolour(String colour) {
		this.colour = colour;

	}

	public String getcolour() {
		return colour;

	}

	public void setspeed(int speed) {
		this.speed = speed;
	}

	public int getspeed() {
		return speed;

	}

	public void setmodel(int model) {
		this.model = model;
	}

	public int getmodel() {
		return model;

	}

	public void setcompany(String company) {
		this.company = company;

	}

	public String getcompany() {
		return company;

	}
	
	public void brake(int brake) {
		if(speed==0) {
			System.out.println("Car is stopped");
		}else {
			speed=speed-20;
		}
		
	}
	
	public void accelerator(int accelerator) {
		if(speed==200|| speed>200) {
			System.out.println("please apply brakes");
		}else {
			speed=speed+30;
		}
	}
	
	public void changegear(int gear) {
		if(gear>NO_OFGEAR) {
			System.out.println("invalid gear");
		}
		if(gear==1){
			System.out.println("first gear applied");
			speed=20;
			System.out.println("current speed is = "+speed);
		}
		
		if(gear==2) {
			System.out.println("second gear applied");
			speed=40;
			
		}
		if(gear==3) {
			System.out.println("third gear applied");
			speed=60;
		}
		if(gear==4) {
			System.out.println("fourth gear applied");
			speed=80;
		}
	}
	
	
}
