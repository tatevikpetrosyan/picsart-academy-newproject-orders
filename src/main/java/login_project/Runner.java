package login_project;

import login_project.exceptions.UserInvalidExceprion;
import login_project.models.User;
import login_project.models.UserPosts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    static List<User> users = new ArrayList<>();
    static List<UserPosts> userPosts = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static User currentUser;
    static boolean isAlive = true;

    public static void main(String[] args) {
        System.out.println("Welcome ....");
        while (isAlive) {
            if (currentUser == null) {
                handleLogedOutState();
            } else {
                handleLogedInState();
            }
        }
    }

    public static void handleLogedInState() {
        System.out.println("Type 1 for viewing personal info");
        System.out.println("Type 2 for updating personal info");
        System.out.println("Type 3 for creating a post");
        System.out.println("Type 4 for liking a post");
        System.out.println("Type 5 for logout");
        System.out.println("Type 6 for exit");

        String command = scanner.nextLine();
        switch (command) {
            case "1":
                System.out.println(currentUser);
                break;
            case "2":
                updatePersonalInfo();
                break;
            case "3" :
                createPost();
                break;
            case "4" :
                like();
                break;
            case "5":
                currentUser = null;
                break;
            case "6":
                isAlive = false;
                break;
            default:
                System.out.println("Invalid argument");

        }

    }

    public static void handleLogedOutState() {
        System.out.println("Type 1 for reg");
        System.out.println("Type 2 for login");
        System.out.println("Type 3 for exit");

        String command = scanner.nextLine();
        switch (command) {
            case "1":
                try { register();

                } catch (UserInvalidExceprion e) {
                    System.out.println(e);;
                };
                break;
            case "2":
                login();
                break;
            case "3":
                isAlive = false;
                break;
            default:
                System.out.println("Invalid argument");
        }
    }

    public static void register() throws UserInvalidExceprion {

        User user = new User();
        System.out.println("Input username");
        user.setUsername(scanner.nextLine());
        System.out.println("Input password");
        user.setPassword(scanner.nextLine());
        users.add(user);
        System.out.println("You are successfully registered");
        throw new UserInvalidExceprion("Error");
    }

    public static void login() {
        System.out.println("Type your username");
        String username = scanner.nextLine();
        User user = users.stream().filter(u -> u.getUsername().equals(username))
                .findAny()
                .orElse(null);
        if (user == null) {
            System.out.println("Invalid user");
            return;
        }
        System.out.println("Type your password");
        String password = scanner.nextLine();
        if (!user.getPassword().equals(password)){
            System.out.println("Invalid password");
            return;
        }
        System.out.println("You are successfully logged in");
        currentUser = user;
    }

    public static void updatePersonalInfo() {
        System.out.println("Input name");
        String name = scanner.nextLine();
        currentUser.setName(name);
        System.out.println("Input age");
        int age = scanner.nextInt();
        scanner.nextLine();
        currentUser.setAge(age);

    }

    public static void createPost() {
        UserPosts userPost = new UserPosts();
        System.out.println("Write post content");
        String content = scanner.nextLine();
        userPost.setContent(content);
        userPost.setWriter(currentUser);
        userPosts.add(userPost);
    }

    public static void like() {
        if (!userPosts.isEmpty()) {
            System.out.println(userPosts);
            System.out.println("Whose post to like? Write a number");
            int number = scanner.nextInt();
            scanner.nextLine();
            for (UserPosts a : userPosts) {
                if (a.getId() == number) {
                    System.out.println("Liked the post N " + a.getId());
                }
            }
        } else {
            System.out.println("No posts");
        }
    }
}
