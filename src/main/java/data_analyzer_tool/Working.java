package data_analyzer_tool;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Working {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type numbers or NO for exit");
        String input = scanner.nextLine();
        String[] numbersArray = input.split(" ");

        ArrayList<Integer> myNums = new ArrayList<>();

        if (input.equalsIgnoreCase("NO")) {
            System.out.println("Exit program");
        } else {
            for (String a : numbersArray) {
                int b = Integer.parseInt(a);
                myNums.add(b);
                }
            }

        Analyzer<Integer> analizer = new Analyzer<>(myNums);

        System.out.println("The even numbers count is: " + analizer.countEven(myNums));
        System.out.println("The odd numbers count is: " + analizer.countOdd(myNums));
        System.out.println("The division by 3 numbers count is: " + analizer.countDiv3(myNums));

        Collections.sort(myNums);
        System.out.println("Sorted order list is " + myNums);
        Collections.reverse(myNums);
        System.out.println("Reversed order list is " + myNums);

    }

}

