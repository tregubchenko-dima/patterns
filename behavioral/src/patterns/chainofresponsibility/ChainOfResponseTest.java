package patterns.chainofresponsibility;

public class ChainOfResponseTest {

    public static void main(String[] args){
        BaseLoggingHandler loggingHandler = new DebugLoggingHandler();
        InfoLoggingHandler infoLoggingHandler = new InfoLoggingHandler();
        WarnLoggingHandler warnLoggingHandler = new WarnLoggingHandler();

        loggingHandler.setNext(infoLoggingHandler);
        infoLoggingHandler.setNext(warnLoggingHandler);

        loggingHandler.logMessage("Something happened", LogLevel.DEBUG);
        loggingHandler.logMessage("Something happened", LogLevel.INFO);
        loggingHandler.logMessage("Something happened", LogLevel.WARN);
    }
}
