package chapter13.stream;

import java.util.ArrayList;
import java.util.List;

class UserInfo{
    private String name;
    private int age;

    public UserInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class UserInfoTest {
    public static void main(String[] args) {
        UserInfo userKim = new UserInfo("김영희", 30);
        UserInfo userLee = new UserInfo("이민지", 40);
        UserInfo userSong = new UserInfo("송영수", 55);

        List<UserInfo> userInfos = new ArrayList<>();
        userInfos.add(userKim);
        userInfos.add(userLee);
        userInfos.add(userSong);

        userInfos.stream()
                .filter(user -> user.getAge() >= 40)
//              여기까지는 40세 이상 사용자 필터링
                .map(UserInfo::getName)
//              여기서 이름을 추출
                .forEach(s -> System.out.println(s));

    }
}
