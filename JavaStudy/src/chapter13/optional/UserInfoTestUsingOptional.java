package chapter13.optional;

import java.util.ArrayList;
import java.util.Optional;

public class UserInfoTestUsingOptional {
    public static void main(String[] args) {
        ArrayList<UserInfo> userInfoList = new ArrayList<>();
        userInfoList.add(new UserInfo(12345, "James"));
        userInfoList.add(new UserInfo(12346, "Tomas"));
        userInfoList.add(new UserInfo(12347, "Terry"));

        usingOptional(userInfoList);
    }
    public static void usingOptional(ArrayList<UserInfo> list){
//      ArrayList 에서 아이디로 사용자를 찾아옴. 반환값이 Optional 클래스
        Optional<UserInfo> userInfoOptional = getUserInfoByIdOptional(12341, list);

//      ifPresent() 메서드를 사용하여 값이 존재하는 경우에만 출력
        userInfoOptional.ifPresent(userInfo -> System.out.println("User name found : " + userInfo.getName()));

//      isPresent() 메서드를 사용하여 조건문 처리
        if(userInfoOptional.isPresent()){
            System.out.println("User name found : " + userInfoOptional.get().getName());
        }else{
            System.out.println("User not found.");
        }

//      orElse() 메서드를 사용하여 값이 없는 경우 기본값을 생성
        UserInfo nameOrDefault = userInfoOptional.orElse(new UserInfo(00000, "Guest"));
        System.out.println("User name : " + nameOrDefault.getName() );

//      orElseGet() 메서드를 사용하여 기본값을 람다식 처리
        UserInfo nameOrComputed = userInfoOptional.orElseGet(() -> generateDefaultUserInfo());
        System.out.println("User name : " + nameOrComputed.getName());

//      orElseThrow() 메서드를 사용하여ㅛ 값이 없을때 예외 처리
        try {
            UserInfo userNotFound = userInfoOptional.orElseThrow(() -> new IllegalStateException("User not found"));
            System.out.println("User name : " + userNotFound.getName());
        }catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }

    }

    public static Optional<UserInfo> getUserInfoByIdOptional(int id, ArrayList<UserInfo> list){
       for(UserInfo userInfo : list){
           if(id == userInfo.getId()){
               return Optional.of(userInfo);
           }
       }
        return Optional.empty();
    }

    public static UserInfo generateDefaultUserInfo(){
        return new UserInfo(00000, "게스트");
    }
}
