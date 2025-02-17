package chapter9.practiceGameLevel;

public class BeginnerLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("천천히 걷는다");
    }

    @Override
    public void jump() {
        System.out.println("점프 못함");

    }

    @Override
    public void turn() {
        System.out.println("턴할줄 모름");

    }

    @Override
    public void showLevelMessage() {
        System.out.println("========초급자==========");

    }
}
