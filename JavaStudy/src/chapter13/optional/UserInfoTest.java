package chapter13.optional;

import java.util.ArrayList;
import java.util.Iterator;

public class UserInfoTest {
    public static void main(String[] args) {
        ArrayList<UserInfo> userInfoList = new ArrayList<>();
        userInfoList.add(new UserInfo(12345, "James"));
        userInfoList.add(new UserInfo(12346, "Tomas"));
        userInfoList.add(new UserInfo(12347, "Terry"));

//      아이디가 12345에 해당하는것 찾기
        UserInfo userInfo = getUserInfoById(12345, userInfoList);
//      회원 이름 출력
        if(userInfo.getName() != null){
        System.out.println(userInfo.getName());
        }

    }
    public static UserInfo getUserInfoById(int id, ArrayList<UserInfo> list){
        for(UserInfo userInfo : list){
            if(id == userInfo.getId())
                return userInfo;
        }
        return null;
    }
}
