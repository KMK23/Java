package chapter12.collection.hashset;

import chapter12.collection.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet( ){
        hashSet = new HashSet<Member>();
    }
    public void addMember(Member member){
        hashSet.add(member);
    }
    public boolean removeMember(int memberID){
        Iterator<Member> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            Member member = iterator.next();
            int tempID = member.getMemberID();
            if(tempID == memberID){
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberID + "가 존재하지 않습니다");
        return false;
    }


    public void showAll(){
        Iterator<Member> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            Member member = iterator.next();
            System.out.println(member);
        }
        System.out.println();
    }
}
