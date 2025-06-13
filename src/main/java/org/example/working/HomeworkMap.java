package org.example.working;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HomeworkMap {
    public static void main(String[] args) {

        //Task3
        HashMap<String, Integer> hmap2 = new HashMap<>();
        hmap2.put("Tatev", 90);
        hmap2.put("Ani", 80);
        hmap2.put("Hayk", 75);
        hmap2.put("Mari", 63);
        hmap2.put("Narek", 82);
        System.out.println(hmap2.get("Ani"));

        Set<Map.Entry<String, Integer>> set = hmap2.entrySet();
        for (Map.Entry<String, Integer> a : set) {
            if (a.getValue() > 80) {
                System.out.println("Key: " + a.getKey() + "," + " Value: " + a.getValue());
            }
        }

        //Task1
        //	Word Counter
        //	•	Read a sentence from the console.
        //	•	Count the frequency of each word using a HashMap<String, Integer>.
        String text = "barev aaa ggg aaa sss aaa ggg";
        String [] words = text.split(" ");
        HashMap<String, Integer> countsMap = new HashMap<>();

        for (String anyVar : words) {
            if (countsMap.get(anyVar) == null) {
                countsMap.put(anyVar, 1);
            }else {
                int currentCount = countsMap.get(anyVar);
                countsMap.put(anyVar, currentCount + 1);
            }
        }
        System.out.println(countsMap);


    }
}
