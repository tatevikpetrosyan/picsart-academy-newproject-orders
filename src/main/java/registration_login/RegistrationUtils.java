package registration_login;

public class RegistrationUtils {

    public static boolean isUserValid(User user) {

        boolean isValid = true;
            if (user.getUsername().length() <= 10) {
                isValid = false;
                System.out.println("Username should be more than 10 digits long");
            }
            if (!user.getEmail().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
                isValid = false;
                System.out.println("Email is not valid");
            }
            if (user.getPassword().length() <= 8) {
                isValid = false;
                System.out.println("Password should be more than 8 digits");
            }
            if (isValid == true) {
                System.out.println("Dear " + user + " you are successfully registered");
            }
        return isValid;
    }
}
