package chapter12.collection.arrayList;

import chapter12.collection.Member;
import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList(){
        arrayList = new ArrayList<Member>();
    }

    public void addMember(Member member){
        arrayList.add(member);
    }

    public boolean removeMember(int memberID){


//        for(int i = 0; i<arrayList.size(); i++){
//            Member member = arrayList.get(i);
//            int tempId = member.getMemberID();
//            if(memberID == tempId){
//                arrayList.remove(i);
//                return true;
//            }
//        }


//        iterator 사용해서 해보자

        Iterator<Member> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            Member member = iterator.next();
            int tempId = member.getMemberID();
            if (memberID == tempId) {
                arrayList.remove(member);
                return true;
            }
        }

        System.out.println(memberID + "가 존재하지 않습니다.");
        return false;
    }

    public void showAll(){
//        for(Member member : arrayList){
//            System.out.println(member);
//        }
//        System.out.println();
        Iterator<Member> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            Member member = iterator.next();
            System.out.println(member);
            System.out.println("========for문이 아닌 Iterator로 showAll을 찍었다========");
        }
        System.out.println();
    }

}
