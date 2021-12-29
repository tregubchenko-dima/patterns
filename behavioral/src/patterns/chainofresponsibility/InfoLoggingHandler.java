package patterns.chainofresponsibility;

public class InfoLoggingHandler extends BaseLoggingHandler{

    @Override
    public void logMessage(String message, LogLevel logLevel) {
        if(logLevel == LogLevel.INFO){
            System.out.println(logLevel + ": " + message);
        }else{
            super.logMessage(message, logLevel);
        }
    }
}
