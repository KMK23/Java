package chapter12.collection.treeSet;

import chapter12.collection.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet(){
        treeSet = new TreeSet<>(new Member());
    }
//   comparator 를 쓸때 디폴트 constructor를 불러줘야하고
    
    public void addMember(Member member){
        treeSet.add(member);
    }
    public boolean removeMember(int memberID){
        Iterator<Member> ir = treeSet.iterator();
        while(ir.hasNext()){
            Member member = ir.next();
            int tempID = member.getMemberID();
            if(tempID == memberID ){
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberID + "가 존재하지 않습니다.");
        return false;
    }

    public void showAll(){
        Iterator<Member> ir = treeSet.iterator();
        while(ir.hasNext()){
            Member member = ir.next();
            System.out.println(member);
        }
        System.out.println();
    }
}
