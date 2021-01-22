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
        mgr.insertMember(new Silver("김윤수1", "Silver",1000));
        mgr.insertMember(new Silver("김윤수2", "Silver",2000));
        mgr.insertMember(new Silver("김윤수3", "Silver",3000));
        mgr.insertMember(new Gold("김윤수4", "Gold",1000));
        mgr.insertMember(new Gold("김윤수5", "Gold",2000));
        mgr.insertMember(new Gold("김윤수6", "Gold",3000));
        mgr.insertMember(new Vip("김윤수7", "Vip",10000));
        mgr.insertMember(new Vvip("김윤수8", "VVip",100000));
        mgr.printData();
    }
}