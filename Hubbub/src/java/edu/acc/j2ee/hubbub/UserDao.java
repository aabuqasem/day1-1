package edu.acc.j2ee.hubbub;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private final List<User> users = new ArrayList<>();

    public UserDao() {}
    
    public User register(String username, String password1, String password2) {
        if (! password1.equals(password2))
            return null;
        if (! username.matches("^\\w{6,12}$"))
            return null;
        if (! password1.matches("^[^<>'\"` ]{8,20}"))
            return null;
        /*
        if (! password1. matches("[A-Z]"))
            return null;
        if (! password1.matches("\\d"))
            return null;
        if (! password1.matches("[a-z]"))
            return null;
        if (! password1.matches("[\\-~!@#$%\\^&\\*\\(\\)\\+=\\|\\{\\}\\[\\]:;,\\?/]"))
            return null;
        */
        for (User u : users)
            if (u.getUsername().equals(username))
                return null;
        User newUser = new User(username, password1);
        users.add(newUser);
        return newUser;
    }
    
    public User authenticate(String username, String password) {
        for (User u : users)
            if (u.getUsername().equals(username) &&
                    u.getPassword().equals(password))
                return u;
        return null;
    }
}
