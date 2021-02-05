package exception;

public class Account {
	private String account;
	private double balance;
	private double interestRate;
	public Account() {
		super();
	}
	public Account(String account, double balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public double calculateInterest() {
		return balance*(interestRate/100);
	}
	public void deposit(double money) throws Exception {
		if(money<0)
			throw new Exception();
		balance+=money;
	}
	public void withdraw(double money) throws Exception {
		if(balance<money || money<0)
			throw new Exception();
		else 
			balance-=money;
	}
	public String getAccount() {
		return account;
	}
	public double getBalance() {
		return balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	
}
