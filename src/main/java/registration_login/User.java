package registration_login;

import java.util.List;

public class User {
    private String fullName;
    private String username;
    private String email;
    private String password;
    private List<String> userNotes;

    public User(String fullName, String username, String email, String password) {
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getUserNotes() {
        return userNotes;
    }

    public void setUserNotes(List<String> userNotes) {
        this.userNotes = userNotes;
    }

    @Override
    public String toString() {
        return username ;
    }

    @Override
    public boolean equals(Object obj) {
        return this.username.equals(((User)obj).username) && this.password.equals(((User)obj).password);
    }
}
