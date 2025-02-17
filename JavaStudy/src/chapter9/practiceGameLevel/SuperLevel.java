package chapter9.practiceGameLevel;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("빨리 걷는다");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 점프");

    }

    @Override
    public void turn() {
        System.out.println("턴!!");

    }

    @Override
    public void showLevelMessage() {
        System.out.println("========고급자==========");

    }
}
