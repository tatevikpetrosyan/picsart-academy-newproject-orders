package org.example.enumHomework;

import java.util.ArrayList;
import java.util.Arrays;

public class Work {
    public static void main(String[] args) {
        //Task 1
        // Define a Simple Enum
        // Create an enum DayOfWeek with constants for each day (MONDAY to SUNDAY).
        //	•	Task: Print a message based on the current day.
        DayOfWeek currentDay = DayOfWeek.FRIDAY;
        System.out.println("Today is " + currentDay);

        System.out.println("_______________________");
        //Task 2.	Enum with Switch Case
        //Use the DayOfWeek enum in a switch statement to print whether the day is a weekday or weekend.

        weekDays(DayOfWeek.MONDAY);
        weekDays2(DayOfWeek.SATURDAY);

        System.out.println("_______________________");
        //Task 3. Enum with Methods
        // Create an enum Season with a method getAverageTemp().
        //	• Task: Print the average temperature for each season.

        Season s1 = Season.WINTER;
        Season s2 = Season.SPRING;
        Season s3 = Season.SUMMER;
        Season s4 = Season.AUTUMN;

        ArrayList<Season> seasons = new ArrayList<>(Arrays.asList(s1, s2, s3, s4));
        for (Season season : seasons) {
            System.out.println(season.getAverageTemp());
        }

    }
    //version 1
    static void weekDays(DayOfWeek dw) {
        if (dw == DayOfWeek.MONDAY ||
                dw == DayOfWeek.TUESDAY ||
                dw == DayOfWeek.THURSDAY ||
                dw == DayOfWeek.WEDNESDAY ||
                dw == DayOfWeek.FRIDAY) {
            System.out.println("Day is weekday");
        } else {
            System.out.println("Day is weekend");
        }
    }
    //version 2
    static void weekDays2 (DayOfWeek dayofWeek){
        switch (dayofWeek) {
            case MONDAY:
                System.out.println("Day is weekday");
                break;
            case TUESDAY:
                System.out.println("Day is weekday");
                break;
            case WEDNESDAY:
                System.out.println("Day is weekday");
                break;
            case THURSDAY:
                System.out.println("Day is weekday");
                break;
            case FRIDAY:
                System.out.println("Day is weekday");
                break;
            case SATURDAY:
                System.out.println("Day is weekend");
                break;
            case SUNDAY:
                System.out.println("Day is weekend");
                break;
        }

    }

}
