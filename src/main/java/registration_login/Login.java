package registration_login;

import java.util.HashMap;
import java.util.Scanner;

public class Login {

    public static void login(HashMap<String, User> usersMap) {
        Scanner scanner = new Scanner(System.in);

        int attempts = 3;
        while (attempts > 0) {

            System.out.println("You have " + attempts + " attemps for login");
            System.out.println("Please type your username");
            String username = scanner.nextLine();

            System.out.println("Please type your password");
            String password = scanner.nextLine();
            if (usersMap.containsKey(username)) {

                User user = usersMap.get(username);
                if (password.equals(user.getPassword())) {
                    System.out.println("Dear " + username + " you are successfully logged in");
                    System.out.println("Good working day!!!");
                    break;
                } else {
                    System.out.println("Incorrect password");
                }

            } else {
                System.out.println("Invalid username");
            }
            attempts = attempts - 1;
        }
        System.out.println("You do not have any attempt to login");
    }

}

