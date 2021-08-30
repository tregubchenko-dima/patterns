package com.patterns.proxy;

public class DisplayTimetable {

    private TimetableTrains timetableTrains = new TimetableElectricTrainsProxy();

    public void printTimetable(){
        String[] timetable = timetableTrains.getTimeTable();
        String[] tmpArr;

        System.out.println("Поезд\tОткуда\tКуда");
        for(int i=0; i<timetable.length; i++){
            tmpArr = timetable[i].split(";");
            System.out.printf("%s\t%s\t%s\n", tmpArr[0], tmpArr[1], tmpArr[2]);
        }
    }
}
