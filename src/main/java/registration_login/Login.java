package registration_login;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public static void login(ArrayList<User> usersStorage) {
        Scanner scanner = new Scanner(System.in);

        int attempts = 3;
        while (attempts > 0) {

            System.out.println("You have " + attempts + " attempts for login");
            System.out.println("Please type your username");
            String username = scanner.nextLine();

            System.out.println("Please type your password");
            String password = scanner.nextLine();

            boolean loginSuccess = false;
            for (User user : usersStorage) {
                if (user.getUsername().equals(username)) {
                    if(user.getPassword().equals(password)) {
                        loginSuccess = true;
                        break;
                    }
                }
            }
            if (loginSuccess) {
                System.out.println("Dear " + username + " you are successfully logged in");
                System.out.println("Good working day!!!");
                return;
            } else {
                System.out.println("Invalid username or password");
            }
            attempts = attempts - 1;
        }
        System.out.println("You do not have any attempt to login");
    }
}