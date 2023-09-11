package br.edu.fesfafic.biblioteca.Main;

import br.edu.fesfafic.biblioteca.Model.User;
import br.edu.fesfafic.biblioteca.Model.Book;
import br.edu.fesfafic.biblioteca.Model.Library;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        User user1 = new User(
            "Shelldon Ryan", 
            "shelldon.boy15@gmail.com");
        
        user1.DisplayInfo();

        Book book1 = new Book(
            "The Psychology of Money", 
            "Morgan Housel", 
            "6555111100", 
            LocalDate.of(2021, 3, 12), 
            0);
        
        Book book2 = new Book(
            "The 48 Laws of Power", 
            "Robert Greene", 
            "6555323604", 
            LocalDate.of(1998, 1, 1), 
            8);

        Library library = new Library(
            "The end Knowlodge", 
            "Street 13ª Friday");
        
        library.signUpBook(book1);
        library.signUpBook(book2);
        library.checkAvailability();

        Book findBoook1 = library.locateBookPerAuthor("Robert Greene");
        Book findBoook2 = library.locateBookPerTitle("The Psychology of Money");

        if (findBoook1 != null) {
            findBoook1.DisplayInfo();
        } else {
            System.out.println("This author not found!");
        }

        if (findBoook2 != null) {
            findBoook2.DisplayInfo();
        } else {
            System.out.println("This title not found!");
        }

    }
}
