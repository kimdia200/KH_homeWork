package com.kh.edu;
/*
 * �ڹ� �⺻ APIȰ��
* package : com.kh.edu
* class : TestJavaApi
* �޼ҵ� : public static void main(String[] args){ }
�ڹٿ��� �����ϴ� API �� java.util.Date Ŭ������ �̿��ؼ� ���� ��¥�� ����ϼ���
    ������� : 2020/8/14
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestJavaApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/M/d");
		System.out.println(format.format(date));

	}

}
