package com.patterns.proxy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimetableElectricTrains implements TimetableTrains{
    @Override
    public String[] getTimeTable() {
        List<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new FileReader(new File("src/com.patterns/proxy/tmp/file.csv")));
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list.toArray(new String[list.size()]);
    }

    @Override
    public String getTrainDepartureTime(String trainId) {
        String[] timetable = getTimeTable();
        for(int i=0; i<timetable.length; i++){
            if(timetable[i].startsWith(trainId+";")) return timetable[i];
        }
        return "";
    }
}
