package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main5 {
    public static void main(String[] args) {
        //first task
        Box <String > b = new Box<String>();
        b.setItem("Tatev");
        System.out.println(b.getItem());

        Box <Integer> b1 = new Box<>();
        System.out.println(b1.getItem()); //null version

        Box<Integer> b2 = new Box<>();
        b2.setItem(5);
        System.out.println(b2.getItem());

        //second task
        System.out.println("__________");
        Pair<Integer, String> pair = new Pair<>();
        pair.setKey(1);
        pair.setValue("Tatev");
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
        pair.printing();

        System.out.println();
        Pair<String, String> pair2 = new Pair<>();
        pair2.setKey("Armenia");
        pair2.setValue("7");
        System.out.println(pair2.getKey() + ":" + pair2.getValue());

        //other version
        System.out.println();
        System.out.println("______________");
        Pair3<Integer, String> pair3 = new Pair3<>();
        HashMap<Integer, String> myHmap = new HashMap<>();
        myHmap.put(1, "Tatev");
        myHmap.put(2, "Ani");
        myHmap.put(3, "Hayk");
        pair3.setMyMap(myHmap);
        System.out.println(pair3.getMyMap());
    }
}
