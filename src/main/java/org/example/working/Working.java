package org.example.working;

import java.sql.Array;
import java.util.*;

public class Working {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(8, 9, -10, 6, -7, 2, -60, 4));

        System.out.println("Task 1______________");
        //Print max and min values version 1
        TreeSet<Integer> treeSet = new TreeSet<>(list);
        System.out.println("min is " + treeSet.first());
        System.out.println("max is " + treeSet.last());

        //Print max and min values, version 2
        System.out.println("---------");
        System.out.println("min is " + Collections.min(list));
        System.out.println("max is " + Collections.max(list));

        //Print max and min values, version 3
        System.out.println("---------");
        Collections.sort(list);
        System.out.println(list.getFirst());;
        System.out.println(list.getLast());

        System.out.println("Task 2______________");
        //Remove negative values, gyuxakan version
        ArrayList<Integer> negatives = new ArrayList<>();
        for (int i : list) {
            if(i<0){
            negatives.add(i);
            }
        }
        for (Integer neg : negatives) {
            list.remove(neg);
        }
        System.out.println(list);

        //version 2
        System.out.println("------------");
        list.removeIf(n -> n < 0);
        System.out.println(list);

        System.out.println("Task 3_____________");
        //Change to Uppercase
        ArrayList<String> names = new ArrayList<>(Arrays.asList("anna", "ani", "narek"));
        for (int i = 0; i < names.size(); i++) {
            String b = names.get(i).toUpperCase();
            names.set(i, b);
        }
        System.out.println(names);

        //version 2
        System.out.println("----------");
        for (String i : names) {
            int index = names.indexOf(i);
            String upperCase = i.toUpperCase();
            names.set(index, upperCase);

        }
        //version3
        System.out.println("----------");
        for (String i : names) {
            names.set(names.indexOf(i), i.toUpperCase());
        }

        System.out.println("Task 4_____________");
        //sorting
        ArrayList<String> names1 = new ArrayList<>(Arrays.asList("suren", "anna", "ani", "narek"));
        Collections.sort(names1);
        System.out.println(names1);
        Collections.reverse(names1);
        System.out.println(names1);

        System.out.println("Task 5_____________");
        String max = names1.getFirst();
        for (String name : names1) {
            if (name.length() > max.length()) {
                max = name;
            }
        }
        System.out.println(max);

    }

}

