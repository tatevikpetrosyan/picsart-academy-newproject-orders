package org.example.enumHomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        //Task 1
        // Define a Simple Enum
        // Create an enum DayOfWeek with constants for each day (MONDAY to SUNDAY).
        //	•	Task: Print a message based on the current day.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week (e.g., MONDAY): ");
        String input = scanner.nextLine().trim().toUpperCase();

        DayOfWeek currentDay = DayOfWeek.valueOf(input);
        System.out.println("Today is " + currentDay);

        System.out.println("_______________________");
        //Task 2.	Enum with Switch Case
        //Use the DayOfWeek enum in a switch statement to print whether the day is a weekday or weekend.
        System.out.print("Enter a day of the week (e.g., MONDAY): ");
        String input1 = scanner.nextLine().trim().toUpperCase();
        weekDays(DayOfWeek.valueOf(input1));
        weekDays2(DayOfWeek.valueOf(input1));

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
            case MONDAY, FRIDAY, TUESDAY, WEDNESDAY, THURSDAY:
                System.out.println("Day is weekday");
                break;
            case SATURDAY, SUNDAY:
                System.out.println("Day is weekend");
                break;
        }

    }

}
