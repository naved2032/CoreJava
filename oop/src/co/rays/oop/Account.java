
package co.rays.oop;

public class Account {

	private String number;
	private String type;
	private Double balance;

	public void setnumber(String number) {
		this.number = number;
	}

	public String getnumber() {
		return number;
	}

	public void settype(String type) {
		this.type = type;
	}

	public String gettype() {
		return type;
	}

	public void setbalance(Double balance) {
		this.balance = balance;
	}

	public Double getbalance() {
		return balance;
	}

	public void Deposit(Double Deposit) {
		if (Deposit < 0) {
			System.out.println("invalid amount");

		} else {
			balance = balance + Deposit;
		}
	}

	public void Withdraw(Double Withdraw) {
		if (balance < Withdraw) {
			System.out.println("insufficient balance");

		} else {
			balance = balance - Withdraw;
		}
	}

}