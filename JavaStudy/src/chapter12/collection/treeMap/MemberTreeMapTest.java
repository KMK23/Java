package chapter12.collection.treeMap;

import chapter12.collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member memberLee = new Member(102, "이순신");
        Member memberKim = new Member(101, "김유신");
        Member memberShin = new Member(103, "신사임당");


        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberKim);
        memberTreeMap.addMember(memberShin);

        memberTreeMap.showAllMember();

//        System.out.println();
//
//        memberTreeMap.removeMember(102);
//        memberTreeMap.showAllMember();
    }
}
