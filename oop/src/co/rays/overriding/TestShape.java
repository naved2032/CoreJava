package co.rays.overriding;

public class TestShape {
	
	public static void main(String[] args) {
		
		
		Shape s= new Shape();
		
		s.setColour("red");
		
		System.out.println(s.getColour());
		
		
		
		
		
		
		
		//circle c= new circle();
		
		circle c1= (circle)s;
		
		c1.setRadius(4);
		c1.setColour("blue");
		
		s.area();
		
		System.out.println(c1.getColour());
		
		
		rectangle r= new rectangle();
		
		r.setColour("black");
		r.setLength(12);
		r.setWidth(3);
		
		r.area();
		
		System.out.println(r.getColour());
		
		
		Triangle t= new Triangle();
		
		t.setBase(2);
		t.setHeigth(6);
		t.setColour("red");
		
		t.area();
		
	}

}
