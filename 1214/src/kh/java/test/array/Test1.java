package kh.java.test.array;
/**
 * [����1]
- Ŭ���� : kh.java.test.array.Test1.java
- �޼ҵ�� : public void test()
    ���̰� 100�� �迭�� �����ϰ� 1���� 100������ ���� ������� �迭 �ε����� �־� �� ���� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
   for���� �̿��ϴ� ����� �ѹ��� ����Ͽ� �ۼ��ϼ���.
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
