package br.edu.fesfafic.biblioteca.Model;

import java.util.UUID;

public class User {
    public String username;
    public String email;
    public UUID id;
    public Book[] bookedBooks = new Book[5];

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.id = UUID.randomUUID();
    }

    public void DisplayInfo() {
        System.out.printf("""
                \nUser Profile
                User Name: %s
                E-mail: %s
                """, username, email);
    }
}
