package kh.java.test.array;
/**
 * [문제1]
- 클래스 : kh.java.test.array.Test1.java
- 메소드명 : public void test()
    길이가 100인 배열을 선언하고 1부터 100까지의 값을 순서대로 배열 인덱스에 넣어 그 값을 출력하는 코드를 작성하시오.
   for문을 이용하는 방법을 한번씩 사용하여 작성하세요.
 *
 */
public class Test1 {

	public static void main(String[] args) {
		new Test1().test1();
	}

	public void test1() {
		int[] arr = new int[100];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
