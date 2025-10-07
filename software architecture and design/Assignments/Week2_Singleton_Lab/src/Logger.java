import java.time.LocalDateTime;

public class Logger {
    // TODO: Declare a private static instance of Logger
    private static Logger instance;
    // TODO: Implement a private constructor
    private Logger() {

    }
    // TODO: Implement public static getInstance() method
    public static Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        // TODO: Create a printout which gives the time, and then prints a message
        System.out.println(message);
    }
}
