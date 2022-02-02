package patterns.state;

public class SystemAudition implements AuditionState{

    @Override
    public void logMessage(String message) {
        System.out.println("Send message to system db: " + message);
    }
}
