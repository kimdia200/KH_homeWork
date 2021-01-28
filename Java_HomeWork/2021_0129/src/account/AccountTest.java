package account;

public class AccountTest {
	public static void main(String[] args) {
		//Account객체 생성
		Account acc = new Account("441-0290-1203", 500000,7.3);
		//Account기본정보 출력
		System.out.println("계좌정보: "+acc.getAccount()+
						   " 현재잔액: "+acc.getBalance());
		//Account에 20000원 입금
		acc.deposit(20000);
		//Account 변경 정보 출력
		System.out.println("계좌정보: "+acc.getAccount()+
				   " 현재잔액: "+acc.getBalance());
		//이자출력 - 현재 잔고를 기준으로 고객에게 줄 이자 금액을 출력한다.
		System.out.println("이자: "+acc.calculateInterest());
		
	}
}
