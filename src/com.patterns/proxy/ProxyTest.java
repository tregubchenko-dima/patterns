package com.patterns.proxy;

public class ProxyTest {

    public static void main(String[] args){
        DisplayTimetable displayTimetable = new DisplayTimetable();
        displayTimetable.printTimetable();

        System.out.println("after some time");
        displayTimetable.printTimetable();
    }
}
