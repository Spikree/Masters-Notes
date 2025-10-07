

public class Main {
    public static void main(String[] args) {
        // TODO: Get an instance of the Logger using Logger.getInstance()
        // Logger logger1 = ...
        Logger logger1 = Logger.getInstance();

        // TODO: Get another instance of the Logger and verify it's the same
        // Logger logger2 = ...
        Logger logger2 = Logger.getInstance();

        // TODO: Use both logger instances to log different messages
        // logger1.log("Starting application...");
        // logger2.log("Application running.");

//         TODO: Print whether both logger instances are the same
//         System.out.println("Are both loggers the same instance? " + ...);

        logger1.log("Avi");
        logger2.log("22");

        //LoggerTest loggerTest = new LoggerTest();

    }
}
