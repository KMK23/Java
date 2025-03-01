package chapter12.collection.hashset;

import chapter12.collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberShin = new Member(1003, "신사임당");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberShin);
        memberHashSet.showAll();

        Member memberHong = new Member(1003, "홍길동");
        memberHashSet.addMember(memberHong);
        memberHashSet.showAll();
    }
}
