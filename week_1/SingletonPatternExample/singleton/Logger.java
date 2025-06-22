package singleton;

public class Logger {
    private static Logger Instance;

    private Logger() {
        System.out.println("Logger Instance is created");
    }

public static Logger getInstance() {
    if (Instance == null ) {
        Instance = new Logger();
    } return Instance;
}

    public void log(String message) {
        System.out.println(message);
    }
}