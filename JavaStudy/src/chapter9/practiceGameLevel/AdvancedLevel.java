package chapter9.practiceGameLevel;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("빨리 걷는다");
    }

    @Override
    public void jump() {
        System.out.println("약간 점프");

    }

    @Override
    public void turn() {
        System.out.println("턴할줄 모름");

    }

    @Override
    public void showLevelMessage() {
        System.out.println("========중급자==========");

    }
}
