package co.rays.oop;

public class TestAccount {
	
	
	public static void main(String[] args) {
		
		
		Account a1= new Account();
		
		
		a1.setnumber("A1267");
		a1.settype("Savings account");
		a1.setbalance(700.00);
		
		
		//System.out.println(a1.getnumber());
		//System.out.println(a1.gettype());
		//System.out.println(a1.getbalance());
		//a1.Deposit(120.00);
		//System.out.println(a1.getbalance());
		//a1.Withdraw(500.00);
		//System.out.println(a1.getbalance());
		
		
		Account a2 = new Account();
		
		a2.setnumber("A4338");
		a2.settype("savings account");
		a2.setbalance(0.00);
		a2.Deposit(300.00);
		a2.Withdraw(200.00);
		
		
		System.out.println(a2.getnumber());
		System.out.println(a2.gettype());
		System.out.println(a2.getbalance());
		
		
		
		
		
		
	}

}
