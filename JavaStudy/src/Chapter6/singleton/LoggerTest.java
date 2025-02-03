package Chapter6.singleton;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("프로그램 시작");
        logger2.log("사용자 로그인 시작");

        System.out.println(logger1);
        System.out.println(logger2);
    }
}
