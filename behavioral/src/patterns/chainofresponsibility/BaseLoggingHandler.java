package patterns.chainofresponsibility;

public class BaseLoggingHandler implements LoggingHandler {

    private LoggingHandler successor;

    public void setNext(LoggingHandler successor){
        this.successor = successor;
    }

    @Override
    public void logMessage(String message, LogLevel logLevel) {
        if(successor != null){
            successor.logMessage(message, logLevel);
        }
    }
}
