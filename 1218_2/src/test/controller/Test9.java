package test.controller;
/**
 * ����
 * 2���� �迭�� ����ִ� �������� ���� ū ���� ���� ���� ���� ���Ѵ�.
 * 
 * ��� ������ 
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
		//������� max = Integer.Min_Value;
		//������� min = Integer.Max_Value;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(min>arr[i][j])
					min=arr[i][j];
				if(max<arr[i][j])
					max=arr[i][j];
			}
		}
		System.out.println("���� ū �� : "+max);
		System.out.println("���� ���� �� : "+min);
	}
}