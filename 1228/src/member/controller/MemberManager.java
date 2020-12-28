package member.controller;

import member.model.vo.Gold;
import member.model.vo.Member;
import member.model.vo.Silver;
import member.model.vo.Vip;
import member.model.vo.Vvip;

public class MemberManager {
	
	Member[] member = new Member[40];
	
	
	private int mLastIndex =0;

	
	
	public void insertMember(Silver s) {
		member[mLastIndex++]=s;
	}
	public void insertMember(Gold g) {
		member[mLastIndex++]=g;
	}
	public void insertMember(Vip v) {
		member[mLastIndex++]=v;
	}
	public void insertMember(Vvip vv) {
		member[mLastIndex++]=vv;
	}
	
	public void printData() {
		System.out.println();
		System.out.println("=========================<<회원정보>>==========================");
		System.out.println("이름                               등급                              포인트                         이자포인트");
		System.out.println("=============================================================");
		if(mLastIndex!=0) {
			for(int i=0; i<mLastIndex; i++) {
				System.out.printf("%-30s%-20s%-15.0f%5.2f\n",member[i].getName(),member[i].getGrade(),member[i].getPoint(),member[i].getBonusPoint());
			}
		}
	}

}