package chapter12.collection.treeSet;

import chapter12.collection.Member;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    private TreeSet<Member> treeSet;

    public MemberTreeSet(){
        treeSet = new TreeSet<Member>(new Member());
    }

    public void addMember(Member member){
        treeSet.add(member);
    }

    public boolean removeMember(int memberID){
        Iterator<Member> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            Member member = iterator.next();
            int tempID = member.getMemberID();
            if(memberID == tempID){
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberID + "가 존재 하지 않습니다.");
        return false;
    }

    public void showAll(){
        Iterator<Member> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            Member member = iterator.next();
            System.out.println(member);
        }
        System.out.println();
    }


}
