package patterns.chainofresponsibility;

public class DebugLoggingHandler extends BaseLoggingHandler{

    @Override
    public void logMessage(String message, LogLevel logLevel) {
        if(logLevel == LogLevel.DEBUG){
            System.out.println(logLevel + ": " + message);
        }else{
            super.logMessage(message, logLevel);
        }
    }
}
