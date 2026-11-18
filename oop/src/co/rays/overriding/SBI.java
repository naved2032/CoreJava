package co.rays.overriding;

public class SBI extends bank {
	
	@Override
	public String getBankName() {
		return "SBI";
		
	}

	@Override
	public int getIntrest() {
		// TODO Auto-generated method stub
		return 7;
	}
}
