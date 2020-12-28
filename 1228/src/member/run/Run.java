package member.run;

import member.controller.MemberManager;
import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.Vip;
import member.model.vo.Vvip;

public class Run {
    public static void main(String[] args)
    {
        MemberManager mgr = new MemberManager();
        mgr.insertMember(new Silver("ȫ�浿", "Silver",1000));
        mgr.insertMember(new Silver("��浿", "Silver",2000));
        mgr.insertMember(new Silver("ȫ����", "Silver",3000));
        mgr.insertMember(new Gold("��ȸ��", "Gold",1000));
        mgr.insertMember(new Gold("��ȸ��", "Gold",2000));
        mgr.insertMember(new Gold("��ȸ��", "Gold",3000));
        mgr.insertMember(new Vip("�̼���", "Vip",10000));
        mgr.insertMember(new Vvip("�Ż��Ӵ�", "VVip",100000));
        mgr.printData();
    }
}