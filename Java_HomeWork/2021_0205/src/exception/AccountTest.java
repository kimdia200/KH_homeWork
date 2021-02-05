package exception;

public class AccountTest {
	public static void main(String[] args) {
		// account 객체 생성
		Account account = new Account("441-0290-1203", 500000, 7.3);
		// account 기본 정보 출력
		System.out.println("계좌정보 : "+account.getAccount()+ " "+account.getBalance()+" " +account.getInterestRate()+"%");
		// account 에 -10원 입금 – Exception 처리
		try {
			account.deposit(-10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("입금 금액이 0보다 작습니다.");
		}
		// account 에 600000원 출금 – Exception 처리
		try {
			account.withdraw(600000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("금액이 0보다 적가나 현재 잔액보다 많습니다.");
		}
		// 이자 출력 – 현재 잔고를 기준으로 고객에게 줄 이자 금액을 출력 한다
		System.out.println(account.calculateInterest());
	}
}
