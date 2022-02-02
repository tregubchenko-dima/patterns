package patterns.state;

public class BusinessAudition implements AuditionState{

    @Override
    public void logMessage(String message) {
        System.out.println("Send message to business db: " + message);
    }
}
