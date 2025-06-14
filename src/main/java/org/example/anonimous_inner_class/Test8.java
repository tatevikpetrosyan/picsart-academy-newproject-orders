package org.example.anonimous_inner_class;

public class Test8 {
    public static void main(String[] args) {

        Animal fish = new Animal() {
            @Override
            public void move() {
                System.out.println("swimming...");
            }

            @Override
            public void eat() {
                System.out.println("eating...");
            }

            public void drink() {
                System.out.println("fish does not drinking....");
            }

        };

        fish.drink();
        fish.move();
        fish.eat();
        fish.setName("fish1");
        System.out.println(fish.getName());

    }
}
