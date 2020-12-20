package test.controller;
/**
 * 문제 
 * 2단에서 5단까지의 구구단의 결과 중 홀수인 것 만 출력한다. 단,for 문을 이용한다.
 * @author kimYS
 *
 */
public class Test2 {

	public static void main(String[] args) {
		for(int i=2; i<=5; i++) {
			for(int j=1; j<=9; j++) {
				int temp=i*j;
				if(temp%2==1)
					System.out.println(i+"*"+j+"="+temp);
			}
		}
	}

}
