package co.ray.abstraction;

public class Testanimal {

	public static void main(String[] args) {

		Animal a = new Cat();

		System.out.println(a.say());

		System.out.println("---------------------");

		Animal b = new Dog();

		System.out.println(b.say());

		System.out.println("------------------------");

		Animal c = new Tiger();

		System.out.println();
	}

}
