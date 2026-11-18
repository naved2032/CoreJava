package co.rays.inheritance;

public class TestShape {

	public static void main(String[] args) {

		Circle c = new Circle();

		c.setradius(4);
		c.setBoderwidth(7);
		c.setColour("blue");

		System.out.println(c.getColour());
		System.out.println(c.getradius());

		Rectangle r = new Rectangle();

		r.setLength(2);
		r.setWidth(5);
		r.setBoderwidth(4);
		r.setColour("red");

		System.out.println(r.getColour());

		Triangle t = new Triangle();

		t.setColour("yellow");
		t.setBase(3);
		t.setHeight(5);

	}

}
