package test.controller;
/**
 * ����
 * �迭�� ����ִ� ������ �� Ȧ���� ������ ����ϰ� ���� ���Ѵ�.
 * ��, continue�� �̿��Ͽ� �ۼ��Ѵ�.
 * 
 * ��뵥����
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
		System.out.println("\n�հ� : "+(sum*1.0));
	}

}