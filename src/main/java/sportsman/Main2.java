package sportsman;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        String str1 = "alone";
        String str2 = "with my team";

        String a = SportCategory.SINGLE.toString();
        String b = SportCategory.TEAM.toString();

        Scanner scanner = new Scanner(System.in);

        Sportsman man1 = new Sportsman() {
            @Override
            public void play() {
                System.out.println("Please type your sport");
                String sportName = scanner.nextLine();

                System.out.println("Please type your sport category: either SINGLE or TEAM");
                String sportCategory = scanner.nextLine();
                String upperSportCategory = sportCategory.toUpperCase();

                if (upperSportCategory.equals(a)) {
                    System.out.println("I am playing " + sportName.concat(str1));
                } else if (upperSportCategory.equals(b)) {
                    System.out.println("I am playing " + sportName.concat(str2));
                }
            }
        };
        man1.play();

        Sportsman man2 = new Sportsman() {
            @Override
            public void play() {
                System.out.println("Please type your sport");
                String sportName = scanner.nextLine();

                System.out.println("Please type your sport category: either SINGLE or TEAM");
                String sportCategory = scanner.nextLine();
                String upperSportCategory = sportCategory.toUpperCase();

                if (upperSportCategory.equals(a)) {
                    System.out.println("I am playing " + sportName.concat(str1));
                } else if (upperSportCategory.equals(b)) {
                    System.out.println("I am playing " + sportName.concat(str2));
                }
            }
        };
        man2.play();

        Sportsman man3 = new Sportsman() {
            @Override
            public void play() {
                System.out.println("Please type your sport");
                String sportName = scanner.nextLine();

                System.out.println("Please type your sport category: either SINGLE or TEAM");
                String sportCategory = scanner.nextLine();
                String upperSportCategory = sportCategory.toUpperCase();

                if (upperSportCategory.equals(a)) {
                    System.out.println("I am playing " + sportName.concat(str1));
                } else if (upperSportCategory.equals(b)) {
                    System.out.println("I am playing " + sportName.concat(str2));
                }
            }
        };
        man3.play();
    }
}
