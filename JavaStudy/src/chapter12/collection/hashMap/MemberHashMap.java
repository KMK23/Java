package chapter12.collection.hashMap;

import chapter12.collection.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;
//  여기서 앞에는 키, 뒤에는 밸류

    public MemberHashMap(){
        hashMap = new HashMap<>();
    }

    public void addMember(Member member){
        hashMap.put(member.getMemberID(), member);
    }
    public boolean removeMember(int memberID){
        if(hashMap.containsKey(memberID)){
//            hashMap.get(memberID);
//            이건 꺼내오기(찾을때)
            hashMap.remove(memberID);
            return true;
        }
        System.out.println(memberID + "가 존재 하지 않습니다.");
        return false;
    }

    public void showAll(){
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while(ir.hasNext()){
            int key = ir.next();

            Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
