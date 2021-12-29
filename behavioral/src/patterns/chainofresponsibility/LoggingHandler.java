package patterns.chainofresponsibility;

public interface LoggingHandler {
    void logMessage(String message, LogLevel logLevel);
}
