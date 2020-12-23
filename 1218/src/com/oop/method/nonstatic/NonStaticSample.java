package com.oop.method.nonstatic;
/**
 * 
 * @author ������
 *
 * ������ �� ����ǰ��ֳ� Ȯ�� �ϱ�����
 * ���� ���ʿ��� ����Ʈ���鵵 ���� �־���....
 */
public class NonStaticSample {

	// 1. ��ȯ�� ���� �Ű����� ���� �޼ҵ�
	// ���� ��û�� 1~45������ ������ ���� 6�� �ߺ����� �ʰ� �߻����� ����ϴ� �޼ҵ�
	// �޼ҵ�� : printLottoNumbers
	public void printLottoNumbers() {
		int[] ran = new int[6];
		int temp;
		int err=0;
		for (int i = 0; i < ran.length; i++) {
			temp = (int) (Math.random() * 45) + 1;
			// ù��° �ڸ��� �� ���� �ʿ䰡 ����
			if (i == 0) {
				ran[i] = temp;
			}
			// ù��° �ڸ��� �ƴҰ�� ���� ���ؼ� �ߺ��� �����ؾ���
			else {
				// ���ѹݺ����� ����� �ߺ����� ���� ��� ���� �̱�
				Outter :
				while (true) {
					// ���� ���� ���� �ε����� �ٷ� �� �ڸ� ������ �˻���
					for (int j = 0; j < i; j++) {
						// ���� �ߺ����� �߰��ϸ�
						if (ran[j] == temp) {
							// ���ο� ������ �ο� 
							temp = (int) (Math.random() * 45) + 1;
							//�ߺ��� ����־��� Ȯ���غ����� �־���
							err++;
							// 0��~(i-1)�� �ε��� ���� �˻��ϴ� �ݺ����� ����
							break;
						}
						//j == (i-1)�� �� break ���� �ʾ� �Ʒ� ���ǹ��� ����ȴ� = �ߺ����� ����
						if(j==(i-1)) {
							//���� �ο�
							ran[i]=temp;
							//�� Outter �ݺ��� ����
							break Outter;
						}
					}
				}
			}
		}
		System.out.println("printLottoNumbers �޼ҵ� �۵�!");
		for(int i=0; i<ran.length;i++) {
			System.out.print(ran[i]);
			System.out.print(i!=ran.length-1 ? ", ": "");
		}
		System.out.println("\n�ߺ��� "+err+"�� �־����ϴ�");
	}

	
	// 2. ��ȯ�� ���� �Ű����� �ִ� �޼ҵ�
	// ���� ��û�� ���� �ϳ�, ���� �ϳ��� ���޹޾� ���ڸ� ���� ������ŭ ����ϴ� �޼ҵ�
	// �޼ҵ�� : outputChar
	public void outPutChar(int num, char ch) {
		System.out.println("outPutChar �޼ҵ��۵�!");
		for(int i=0; i<num; i++) {
			System.out.print(ch);
			System.out.print(i!=num-1 ? ", ": "");
		}
		System.out.println("\n���ڿ� "+ch+", �� "+num+"�� ����߽��ϴ�.");
	}
	
	
	// 3. ��ȯ�� �ְ� �Ű����� ���� �޼ҵ�
	// ���� ��û�� ���ĺ� ������ ������ �����ڸ� �ϳ� �߻����� �����ϴ� �޼ҵ�
	// �޼ҵ�� : alphabet
	//65 90
	//97 122
	public char alphabet() {
		int ran;
		System.out.println("alphabet �޼ҵ��۵�!");
		while(true) {
			ran = (int)(Math.random()*122)+1;
			if((ran>='a'&&ran<='z') || (ran>='A'&&ran<='Z')) {
				break;
			}
			//�׳� ���� Ȯ�� �غ����� �־���
			else 
				System.out.println("����" + (char)ran);
		}
		return (char)ran;
	}
	
	
	// 4. ��ȯ�� �ְ� �Ű����� �ִ� �޼ҵ�
	// ���� ��û�� ���ڿ��� �����ε���, ���ε����� ���޹޾� �ش� �ε��� ������ ���ڿ���
	// �����Ͽ� �����ϴ� �޼ҵ�. �� ���ڿ��� �ݵ�� ���� �־����. ������ null ����ó��
	// �޼ҵ�� : mySubstring
	public String mySubString(String s, int start_Index, int end_Index) {
		System.out.println("mySubString �޼ҵ��۵�!");
		if(s==null) {
			System.out.println("�Է��Ͻ� ���ڿ��� ���� �����ϴ�.");
			return null;
		}
		if(start_Index<0) {
			System.out.println("start_Index�� �߸� �Ǿ����ϴ�.");
			return null;
		}
		if(end_Index+1>s.length()) {
			System.out.println("end_Index�� �߸� �Ǿ����ϴ�.");
			return null;
		}
					
		return s.substring(start_Index,end_Index+1);
	}
}