package chapter12.collection.treeMap;

import chapter12.collection.Member;
import chapter12.collection.hashMap.MemberHashMap;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member memberLee = new Member(1002, "이순신");
        Member memberKim = new Member(1003, "김유신");
        Member memberShin = new Member(1001, "신사임당");

        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberKim);
        memberTreeMap.addMember(memberShin);
        memberTreeMap.showAll();

//        memberTreeMap.removeMember(1001);
//        memberTreeMap.showAll();
    }
}
