package br.edu.fesfafic.biblioteca.Model;

import java.time.LocalDate;

public class Book {
    public String title;
    public String author;
    public String isbn;
    public LocalDate release;
    public int amountAvailable;

    public Book(String title, String author, String isbn, LocalDate release, int amountAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.release = release;
        this.amountAvailable = amountAvailable;
    }

    public void DisplayInfo() {
        String formatDate = String.format("%d",this.release.getDayOfMonth()) + "/" + String.format("%d",this.release.getMonthValue()) + "/" + String.format("%d",this.release.getYear());
        System.out.printf("""
                \nInformation about the book
                Title of the book: %s
                Author of the book: %s
                ISBN: %s
                Date of the release: %s
                Amount available: %d
                """, title, author, isbn, formatDate, amountAvailable);
    }
}
