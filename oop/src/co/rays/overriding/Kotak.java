package co.rays.overriding;

public class Kotak extends bank{
	
	@Override
	public int getIntrest() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return "kotak";
	}
}
