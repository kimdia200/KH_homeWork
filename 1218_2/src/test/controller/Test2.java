package test.controller;
/**
 * ���� 
 * 2�ܿ��� 5�ܱ����� �������� ��� �� Ȧ���� �� �� ����Ѵ�. ��,for ���� �̿��Ѵ�.
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
