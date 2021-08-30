package com.patterns.proxy;

public class TimetableElectricTrainsProxy implements TimetableTrains{

    private TimetableTrains timetableTrains = new TimetableElectricTrains();
    private String[] timetableCache = null;

    @Override
    public String[] getTimeTable() {
        if(timetableCache == null){
            timetableCache = timetableTrains.getTimeTable();
        }
        return timetableCache;
    }

    @Override
    public String getTrainDepartureTime(String trainId) {
        if(timetableCache == null){
            timetableCache = timetableTrains.getTimeTable();
        }
        for(int i = 0; i<timetableCache.length; i++){
            if(timetableCache[i].startsWith(trainId + ";")) return timetableCache[i];
        }
        return "";
    }

    public void clearCache(){
        timetableCache = null;
    }
}
