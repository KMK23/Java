package Chapter6.singleton;

public class Logger {

    private static Logger instance = new Logger();

    private Logger(){}

    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();

        }
        return instance;
    }
    public void log(String message){
        System.out.println("[LOG]" + message);
    }
}
