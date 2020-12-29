package com.api.member.run;

import java.util.Calendar;
import java.util.StringTokenizer;

import com.api.member.model.vo.Member;

public class Run {

	public static void main(String[] args) {

		String input = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
		String[] arr1 = input.split("[|]");
		String[] temp;
		Member[] mArr = new Member[arr1.length];

		//arr1
		//1,김연아,165,47,19900905
		//2,양세형,167,60,19850818
		//3,김래원,182,80,19810319
//		String aaa = "19990206";
//		System.out.println(aaa.substring(0,4) + aaa.substring(4,6));
		
		for (int i = 0; i < arr1.length; i++) {
			StringTokenizer st = new StringTokenizer(arr1[i], ",");
			temp=new String[5];
			int j=0;
			while(st.hasMoreTokens()) {
				temp[j]=st.nextToken();
				j++;
			}
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.YEAR, Integer.parseInt(temp[4].substring(0,4)));
			cal.set(Calendar.MONTH, Integer.parseInt(temp[4].substring(4,6))-1);
			cal.set(Calendar.DATE, Integer.parseInt(temp[4].substring(6)));
			mArr[i]=new Member(Integer.parseInt(temp[0]),
					temp[1],
					Integer.parseInt(temp[2]),
					Integer.parseInt(temp[3]),
					cal);
		}
		for(Member m : mArr) {
			System.out.println(m.information());
		}

	}

}
