package chapter12.collection.hashMap;

import chapter12.collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberShin = new Member(1003, "신사임당");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberShin);
        memberHashMap.showAll();

        memberHashMap.removeMember(1001);
        memberHashMap.showAll();
    }
}
