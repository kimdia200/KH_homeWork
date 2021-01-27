package _3;

import java.util.Arrays;

public class Example01 {
	
	static Object[] objArr;
	
	public static void main(String[] args) {
		addData(5);
		System.out.println(Arrays.toString(objArr));
	}
	
	static void addData(int count) {
		objArr = new Object[count*2];
		for(int i=0; i<objArr.length; i++) {
			objArr[i] = new Integer(i/2);
			objArr[++i] = String.valueOf(i/2);
		}
	}

}
