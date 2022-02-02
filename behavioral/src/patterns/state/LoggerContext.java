package patterns.state;

public class LoggerContext {

    private AuditionState auditionState;

    public AuditionState getAuditionState() {
        return auditionState;
    }

    public void setAuditionState(AuditionState auditionState) {
        this.auditionState = auditionState;
    }

    public void logNext(){
        if(auditionState instanceof SystemAudition){
            setAuditionState(new BusinessAudition());
        }else if(auditionState instanceof BusinessAudition){
            setAuditionState(new SystemAudition());
        }
    }

    public void logMessage(String logMsg){
        auditionState.logMessage(logMsg);
    }
}
