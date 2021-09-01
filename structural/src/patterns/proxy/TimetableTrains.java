package patterns.proxy;

public interface TimetableTrains {
    String[] getTimeTable();
    String getTrainDepartureTime(String trainId);
}
