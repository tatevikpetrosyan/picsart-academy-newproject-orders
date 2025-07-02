package registration_login;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main1 {

    public static ArrayList<User> usersStorage = new ArrayList<>();
   // public static HashMap<String, User> usersMap = new HashMap<>();

    public static void main(String[] args) {
        menu();

    }

    public static void menu () {

        Scanner scanner = new Scanner(System.in);
        boolean isActive = true;
        while (isActive) {
            System.out.println("Choose 1 for Registration, 2 for Login or 3 for Exit");
            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1: {
                    System.out.println("Going to registration page");
                    System.out.println();
                    System.out.println("Please type your name and surname");
                    String fullName = scanner.nextLine();

                    System.out.println("Please type your username");
                    String username = scanner.nextLine();

                    System.out.println("Please type your email");
                    String email = scanner.nextLine();

                    System.out.println("Please type your password");
                    String password = scanner.nextLine();
                    User user = new User(fullName, username, email, password);

                    if (RegistrationUtils.isUserValid(user)) {
                        usersStorage.add(user);
                        //usersMap.put(username, user);
                    }
                }
                break;
                case 2: {
                    System.out.println("Going to login page");
                    System.out.println();
                    Login.login(usersStorage);
                    isActive = false;
                }
                break;
                case 3: {
                    System.out.println("Exit");
                    isActive = false;
                    System.out.println("Goodbye");
                }
                break;
            }
    }
}
}