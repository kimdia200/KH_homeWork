package test.controller;
/**
 * 문제
 * 2차원 배열에 들어있는 데이터들 중 3의 배수만 골라내서
 * 새로운 1차원 배열에 기록하고 출력한다.
 * 단, 중복 값은 하나만 기록되게 한다.
 * 
 * 사용 데이터                 12      36                12                18  78    45      72
 * int [][] arr = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}}; 
 * int[] copyAr = new int[array의 행갯수 * 열갯수];
 * 
 * @author kimYS
 *
 */
public class Test10 {

	public static void main(String[] args) {
		//원본
		int [][] arr = {{12, 41, 36, 56},
				{82, 10, 12, 61},
				{14, 16, 18, 78},
				{45, 26, 72, 23}};
		
		//3의 배수가 몇개인지 세어보자
		int count=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]%3==0)
					count++;
			}
		}
		
		//3의 배수가 담길 배열 temp를 만들어서 담아줌
		int[] temp = new int[count];
		count=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]%3==0) {
					temp[count]=arr[i][j];
					count++;
				}
				
			}
		}
		
		//temp 에서의 중복값은 몇개인가?!
		count=0;
		for(int i=1; i<temp.length; i++) {
			for(int j=0; j<i; j++) {
				if(temp[i]==temp[j]) {
					count++;
					break;
				}
			}
		}
		
		//copyAr 선언 및 할당
		int[] copyAr = new int[temp.length-count];
		
		//중복값 제거하고 할당
		copyAr[0]=temp[0];
		count=1;
		
		Outter : 
		for(int i=1; i<temp.length; i++) {
			for(int j=0; j<i; j++) {
				if(temp[i]==temp[j]) {
					continue Outter;
				}
			}
			copyAr[count]=temp[i];
			count++;
		}
		
		//출력
		for(int i=0; i<copyAr.length; i++) {
			System.out.print(copyAr[i]);
			System.out.print(i!=copyAr.length-1 ? ", " : "");
		}
		
	}
}
