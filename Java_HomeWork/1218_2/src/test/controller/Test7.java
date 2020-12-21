package test.controller;
/**
 * 문제
 * 배열에 들어있는 데이터 중 홀수의 값들을 출력하고 합을 구한다.
 * 단, continue를 이용하여 작성한다.
 * 
 * 사용데이터
 * int[] arr = {1,2,3,4,5,6,7,8,9,10}
 * @author kimYS
 *
 */
public class Test7 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2==0)
				continue;
			System.out.print(arr[i] + " ");
			sum+=arr[i];
		}
		System.out.println("\n합계 : "+(sum*1.0));
	}

}
