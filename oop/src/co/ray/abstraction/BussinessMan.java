package co.ray.abstraction;

public class BussinessMan extends Person implements Richman, SocialWorker {

	@Override
	public void helptoOhers() {
		// TODO Auto-generated method stub
		System.out.println("Helps to other");
		
	}

	@Override
	public void party() {
		// TODO Auto-generated method stub
		System.out.println("Party");

	}

	@Override
	public void donation() {
		// TODO Auto-generated method stub
		System.out.println("DOnation");
	}

	@Override
	public void earnmoney() {
		// TODO Auto-generated method stub
		System.out.println("Earnmoney");
		
	}

}
