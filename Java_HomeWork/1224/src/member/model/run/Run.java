package member.model.run;

import member.controller.MemberManager;
import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.Vip;
import member.model.vo.Vvip;

public class Run {

	public static void main(String[] args) {

		MemberManager m = new MemberManager();
		
		m.silverInsert(new Silver("ȫ�浿", "Silver",1000));
        m.silverInsert(new Silver("�踻��", "Silver",2000));
        m.silverInsert(new Silver("��浿", "Silver",3000));
        m.goldInsert(new Gold("��ȸ��", "Gold",1000));
        m.goldInsert(new Gold("��ȸ��", "Gold",2000));
        m.goldInsert(new Gold("��ȸ��", "Gold",3000));
        //vip�߰�
        m.vipInsert(new Vip("�ּ���", "Vip",10000));
        //vvip�߰�
        m.vvipInsert(new Vvip("�ڱ���", "VVip",100000));

        m.printData();

		
	}

}