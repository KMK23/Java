package chapter12.collection.treeMap;

import chapter12.collection.Member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
    private TreeMap<Integer, Member> treeMap;
//  여기서 앞에는 키, 뒤에는 밸류

    public MemberTreeMap(){
        treeMap = new TreeMap<>();
    }

    public void addMember(Member member){
        treeMap.put(member.getMemberID(), member);
    }
    public boolean removeMember(int memberID){
        if(treeMap.containsKey(memberID)){
            treeMap.remove(memberID);
            return true;
        }
        System.out.println(memberID + "가 존재 하지 않습니다.");
        return false;
    }

    public void showAll(){
        Iterator<Integer> ir = treeMap.keySet().iterator();
        while(ir.hasNext()){
            int key = ir.next();

            Member member = treeMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
