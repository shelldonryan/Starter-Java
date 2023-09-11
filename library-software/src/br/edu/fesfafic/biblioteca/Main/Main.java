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
            10);
        
        Book book2 = new Book(
            "The 48 Laws of Power", 
            "Robert Greene", 
            "6555323604", 
            LocalDate.of(1998, 1, 1), 
            8);
        
        book1.DisplayInfo();
        book2.DisplayInfo();

        Library library1 = new Library(
            "The end Knowlodge", 
            "Street 13ª Friday");
        
        library1.checkAvailability();
    }
}
