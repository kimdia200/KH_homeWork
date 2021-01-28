package account;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {
		super();
	}
	public Account(String account, int balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public double calculateInterest() {
		return balance*(interestRate/100);
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) {
		if(money<=balance)
			balance-=money;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
//	형식 : 계좌번호: 221-0101-2111 잔액: 100000원 이자율: 4.5%
	public void accountInfo() {
		System.out.print("계좌번호: "+account+" 잔액: "+balance+"원 이자율: "+interestRate+"%");
	}
	
}
