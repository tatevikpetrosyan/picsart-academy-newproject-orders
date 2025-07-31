package login_project.models;

import login_project.exceptions.UserInvalidExceprion;

public class User {
    private static int count = 0;

    private int id;
    private String name;
    private int age;
    private String username;
    private String password;

    public User () {
        id = count + 1;
        count++;
    }

    public User (int id, String name, int age) {
        id = count + 1;
        count++;
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User (String username, String password) {
        id = count + 1;
        count++;
        this.username = username;
        this.password = password;
    }

    public User(int id, String name, int age, String username, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
       return username;
    }
    public void setUsername(String username) throws UserInvalidExceprion {
        if (username.length() < 5 ) {
            throw new UserInvalidExceprion("Invalid username. Min symbol is 5");
        }
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws UserInvalidExceprion {
        if (password.length() < 7 ) {
            throw new UserInvalidExceprion("Password length should be 7 or more");
        }
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", username='" + username + '\'' +
                '}';
    }
}
