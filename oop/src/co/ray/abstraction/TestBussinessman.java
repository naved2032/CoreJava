package co.ray.abstraction;

public class TestBussinessman {
	public static void main(String[] args) {

		Richman r = new BussinessMan();
		r.donation();
		r.earnmoney();
		r.party();

		SocialWorker s = new BussinessMan();
		s.helptoOhers();

		BussinessMan bs = new BussinessMan();
		bs.donation();
		bs.earnmoney();
		bs.helptoOhers();
		bs.party();

	}
}
