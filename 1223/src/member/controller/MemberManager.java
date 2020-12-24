package member.controller;

import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.Vip;
import member.model.vo.Vvip;

public class MemberManager {
	
	Silver[] silver = new Silver[10];
	Gold[] gold = new Gold[10];
	Vip[] vip = new Vip[10];
	Vvip[] vvip = new Vvip[10];
	
	private int sLastIndex =0;
	private int gLastIndex =0;
	private int vLastIndex =0;
	private int vvLastIndex =0;
	
	
	public void silverInsert(Silver s) {
		silver[sLastIndex++]=s;
	}
	public void goldInsert(Gold g) {
		gold[gLastIndex++]=g;
	}
	public void vipInsert(Vip v) {
		vip[vLastIndex++]=v;
	}
	public void vvipInsert(Vvip vv) {
		vvip[vvLastIndex++]=vv;
	}
	
	public void printData() {
		System.out.println();
		System.out.println("=========================<<회원정보>>==========================");
		System.out.println("이름                               등급                              포인트                         이자포인트");
		System.out.println("=============================================================");
		if(sLastIndex!=0) {
			for(int i=0; i<sLastIndex; i++) {
				System.out.printf("%-30s%-20s%-15.0f%5.2f\n",silver[i].getName(),silver[i].getGrade(),silver[i].getPoint(),silver[i].getBonusPoint());
			}
		}
		if(gLastIndex!=0) {
			for(int i=0; i<gLastIndex; i++) {
				System.out.printf("%-30s%-20s%-15.0f%5.2f\n",gold[i].getName(),gold[i].getGrade(),gold[i].getPoint(),gold[i].getBonusPoint());
			}
		}
		if(vLastIndex!=0) {
			for(int i=0; i<vLastIndex; i++) {
				System.out.printf("%-30s%-20s%-15.0f%5.2f\n",vip[i].getName(),vip[i].getGrade(),vip[i].getPoint(),vip[i].getBonusPoint());
			}
		}
		if(vvLastIndex!=0) 
			for(int i=0; i<vvLastIndex; i++) {
			System.out.printf("%-30s%-20s%-15.0f%5.2f\n",vvip[i].getName(),vvip[i].getGrade(),vvip[i].getPoint(),vvip[i].getBonusPoint());
		}
	}

}
