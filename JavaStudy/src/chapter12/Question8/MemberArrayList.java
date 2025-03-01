package chapter12.Question8;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList(){
        arrayList = new ArrayList<>();
    }

    public void addMember(Member member){
        arrayList.add(member);
    }
    public boolean removeMember(int memberID){
        Iterator<Member> ir = arrayList.iterator();
        while(ir.hasNext()){
            Member member = ir.next();
            int tempID = member.getMemberID();
            if(tempID == memberID){
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberID + "가 존재하지 앟습니다.");
        return false;
    }

    public void showAll(){
        Iterator<Member> ir = arrayList.iterator();
        while(ir.hasNext()){
            Member member = ir.next();
            System.out.println(member);
        }
        System.out.println();
    }

    public void insertMember(Member member, int index) {
        if(index <0 || index > arrayList.size()+1) {
            System.out.println("지정된 자리에 추가할 수 없습니다.");
            return;
        }
        arrayList.add(index-1, member);
    }

}
