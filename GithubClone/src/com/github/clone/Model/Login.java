package com.github.clone.Model;

public class Login {
    public String username;
    public String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean signIn() {
        if(this.username.equals("shelldonryan") && this.password.equals("12345")) {
            return true;
        }
        return false;
    }
}
