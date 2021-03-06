package test.controller;
/**
 * 문제
 * 2차원 배열에 들어있는 데이터중 가장 큰 값과 가장 작은 값을 구한다.
 * 
 * 사용 데이터 
 * int[][] arr = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
 * @author kimYS
 *
 */
public class Test9 {

	public static void main(String[] args) {

		int min,max;
		int[][] arr = {{12, 41, 36, 56},
				{82, 10, 12, 61},
				{14, 16, 18, 78},
				{45, 26, 72, 23}};
		
		min = arr[0][0];
		max = arr[0][0];
		//강사님은 max = Integer.Min_Value;
		//강사님은 min = Integer.Max_Value;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(min>arr[i][j])
					min=arr[i][j];
				if(max<arr[i][j])
					max=arr[i][j];
			}
		}
		System.out.println("가장 큰 값 : "+max);
		System.out.println("가장 작은 값 : "+min);
	}
}