package mobile;

public class MobileTest {
	public static void main(String[] args) {
		// 각각의 Mobile 객체 생성
		Mobile m1 = new Ltab("Ltab", 500, "AP-01");
		Mobile m2 = new Otab("Otab", 1000, "AND-20");
		// 생성된 객체의 정보 출력
		System.out.printf("%7s%15s%15s\n","Mobile","Battery","OS");
		System.out.println("--------------------------------------------");
		System.out.printf("%7s%15s%15s\n",m1.getMobileName(),m1.getBatterySize(),m1.getOsType());
		System.out.printf("%7s%15s%15s\n",m2.getMobileName(),m2.getBatterySize(),m2.getOsType());
		System.out.println();
		// 각각의 Mobile 객체에 10분씩 충전
		m1.charge(10);
		m2.charge(10);
		// 10분 충전 후 객체 정보 출력
		System.out.println("10분 충전");
		System.out.printf("%7s%15s%15s\n","Mobile","Battery","OS");
		System.out.println("--------------------------------------------");
		System.out.printf("%7s%15s%15s\n",m1.getMobileName(),m1.getBatterySize(),m1.getOsType());
		System.out.printf("%7s%15s%15s\n",m2.getMobileName(),m2.getBatterySize(),m2.getOsType());
		System.out.println();
		// 각각의 Mobile 객체에 5분씩 통화
		m1.operate(5);
		m2.operate(5);
		// 5분 통화 후 객체 정보 출력
		System.out.println("5분 통화");
		System.out.printf("%7s%15s%15s\n","Mobile","Battery","OS");
		System.out.println("--------------------------------------------");
		System.out.printf("%7s%15s%15s\n",m1.getMobileName(),m1.getBatterySize(),m1.getOsType());
		System.out.printf("%7s%15s%15s\n",m2.getMobileName(),m2.getBatterySize(),m2.getOsType());
	}
}