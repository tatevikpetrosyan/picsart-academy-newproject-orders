package functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test36 {
    public static void main(String[] args) {

        Human human1 = new Human("Tatev", 30);
        Human human2 = new Human("Ani", 35);
        Human human3 = new Human("Hayk", 40);
        Human human4 = new Human("Anna", 22);

        ArrayList<Human> humans = new ArrayList<>();
        humans.add(human1);
        humans.add(human2);
        humans.add(human3);
        humans.add(human4);

        List<String> streamNames = humans.stream()
                .map((human) -> human.getName())
                .collect(Collectors.toList());

        System.out.println(streamNames);

        List<Integer> streamInt = humans.stream()
                .map((human) -> human.getAge())
                .collect(Collectors.toList());

        System.out.println(streamInt);


        List<String> myList = humans.stream().sorted((h1, h2) -> h1.getAge()- h2.getAge())
                .map(human -> human.getName())
                .collect(Collectors.toList());
        System.out.println(myList);
    }
}
