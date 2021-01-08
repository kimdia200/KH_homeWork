package ncs.test4;

import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품명 입력 : ");
		String name = sc.nextLine();
		System.out.print("가격 입력 : ");
		int price = sc.nextInt();
		System.out.print("수량 입력 : ");
		int quantity = sc.nextInt();
		
		Product p = new Product(name,price,quantity);
		System.out.println(p.information());
	}
}
