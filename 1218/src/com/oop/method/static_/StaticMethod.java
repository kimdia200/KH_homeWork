package com.oop.method.static_;

public class StaticMethod {
    
    //static method
    //1. ������ ���ڿ��� ��� �빮�ڷ� �ٲٴ� static �޼ҵ�
    //�޼ҵ�� : toUpper(String) : String
	public static String toUpper(String s) {
		return s.toUpperCase();
	}
    
    
    //2. ù��° ���ڿ��� ���޹��� �ε����� ���ڸ� ���޹��� ���ڷ� �����ϴ� static �޼ҵ�
    //�޼ҵ�� : setChar(String, int, char)
	//String���� immutable Class�� ���� ���� ����� �� ����
	//Ȥ�� ������  ����ó���� ���ڿ��� �����ϴ°Ŷ��
	
	//********************** ������� ���� �߸������ٰ� String Ÿ�� ���� �ϴ� �޼ҵ尡 �´ٰ��� 
	public static String setChar(String s, int index, char ch) {
		return s.substring(0,index)+ch+s.substring(index+1);
	}
    
    //3. ������ ���ڿ����� �������� ������ �����ϴ� static �޼ҵ�
    //�޼ҵ�� : getAlphabetLength(String) : int
    public static int getAlphabetLength(String s) {
    	int count=0;
    	for(int i=0; i<s.length(); i++) {
    		if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A'&&s.charAt(i)<='Z'))
    			count++;
    	}
    	return count;
    }

    //4. ������ ���ڿ����� �ϳ��� ���ļ� ���� 
    //�޼ҵ�� : concat(String, String) : String
    public static String concat(String s1, String s2) {
    	return s1+s2;
    }
    
}