package patterns.chainofresponsibility;

public class WarnLoggingHandler extends BaseLoggingHandler{

    @Override
    public void logMessage(String message, LogLevel logLevel) {
        if(logLevel == LogLevel.WARN){
            System.out.println(logLevel + ": " + message);
        }else{
            super.logMessage(message, logLevel);
        }
    }
}
