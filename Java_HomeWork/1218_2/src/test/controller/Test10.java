package test.controller;
/**
 * ����
 * 2���� �迭�� ����ִ� �����͵� �� 3�� ����� ��󳻼�
 * ���ο� 1���� �迭�� ����ϰ� ����Ѵ�.
 * ��, �ߺ� ���� �ϳ��� ��ϵǰ� �Ѵ�.
 * 
 * ��� ������                 12      36                12                18  78    45      72
 * int [][] arr = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}}; 
 * int[] copyAr = new int[array�� �హ�� * ������];
 * 
 * @author kimYS
 *
 */
public class Test10 {

	public static void main(String[] args) {
		//����
		int [][] arr = {{12, 41, 36, 56},
				{82, 10, 12, 61},
				{14, 16, 18, 78},
				{45, 26, 72, 23}};
		
		//3�� ����� ����� �����
		int count=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]%3==0)
					count++;
			}
		}
		
		//3�� ����� ��� �迭 temp�� ���� �����
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
		
		//temp ������ �ߺ����� ��ΰ�?!
		count=0;
		for(int i=1; i<temp.length; i++) {
			for(int j=0; j<i; j++) {
				if(temp[i]==temp[j]) {
					count++;
					break;
				}
			}
		}
		
		//copyAr ���� �� �Ҵ�
		int[] copyAr = new int[temp.length-count];
		
		//�ߺ��� �����ϰ� �Ҵ�
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
		
		//���
		for(int i=0; i<copyAr.length; i++) {
			System.out.print(copyAr[i]);
			System.out.print(i!=copyAr.length-1 ? ", " : "");
		}
		
	}
}
