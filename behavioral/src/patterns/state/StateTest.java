package patterns.state;

public class StateTest {

    public static void main(String[] args){

        AuditionState system = new SystemAudition();
        LoggerContext loggerContext = new LoggerContext();
        loggerContext.setAuditionState(system);

        for(int i = 0; i < 2; i++){
            loggerContext.logMessage("Pavel, how is it going?");
            loggerContext.logNext();
        }
    }
}
