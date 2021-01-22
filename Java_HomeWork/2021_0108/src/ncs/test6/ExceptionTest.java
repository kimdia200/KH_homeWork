package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.print("2~5사이의 정수를 입력하세요 : ");
		try {
			
			System.out.println(c.getSum(sc.nextInt()));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
