package test.controller;
/**
 * ����
 * 2���� �迭�� ����ִ� �����͵��� �հ�� ����� ���Ѵ�.
 * 
 * ��뵥����
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
		System.out.println("�� "+denominator+"��");
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
	}
}
