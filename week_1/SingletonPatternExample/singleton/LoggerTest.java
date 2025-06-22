package singleton;

public class LoggerTest{
    public static void main(String[] arge) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger1.log("This is first");
        logger2.log("This is second");

        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are same, Hence singleton patttern is working");
        } else {
            System.out.println("Loggeer1 and Logger2 are different, Hence Singleton pattern failed");
        }
        }
    }