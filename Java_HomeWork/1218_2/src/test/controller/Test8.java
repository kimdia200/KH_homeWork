package test.controller;
/**
 * 문제
 * 2차원 배열에 들어있는 데이터들의 합계와 평균을 구한다.
 * 
 * 사용데이터
 * int[][] arr = {{12,41,36,56},{82,10,12,61},{14,16,18,78},{45,26,72,23}}
 * @author kimYS
 *
 */
public class Test8 {

	public static void main(String[] args) {
		int[][] arr = {{12,41,36,56},
				{82,10,12,61},
				{14,16,18,78},
				{45,26,72,23}};
		int sum=0;
		int denominator=0;
		double avg;
		
		for(int i=0; i<arr.length; i++) {
			denominator+=arr[i].length;
			for(int j=0; j<arr[i].length; j++) {
				sum+=arr[i][j];
			}
		}
		avg=1.0*sum/denominator;
		System.out.println("총 "+denominator+"개");
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
