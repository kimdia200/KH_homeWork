package kh.java.test.array;
/**
 * 
 * [����5]
- Ŭ���� : kh.java.test.array.Test5.java
- �޼ҵ�� : public void test()
    �ֹε�Ϲ�ȣ �����ڸ� ���ĺ��� *�� ������.  
    ��, ���� �迭���� ���� ���� �迭 ���纻���� 
    �����ϼ���
     
    ��Ʈ) ������
       - for���̿� 1:1����
       - System.arraycopy() �żҵ� �̿�
       - clone() �żҵ� �̿�
 *
 */
public class Test5 {

	public static void main(String[] args) {
		new Test5().test();
	}
	
	public void test() {
		char[] chArr = {'y','y','m','m','d','d','-','1','2','3','4','5','6','7'};
		char[] tempArr = chArr.clone();
		
		for(int i = tempArr.length-6;i<tempArr.length;i++) {
			tempArr[i] = '*';
		}
		System.out.println(chArr);
		System.out.println(tempArr);
		
	}

}