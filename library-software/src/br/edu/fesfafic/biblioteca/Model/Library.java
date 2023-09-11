package br.edu.fesfafic.biblioteca.Model;

public class Library {
    public String libraryName;
    public String adress;
    public Book[] avaibleBooks = new Book[100];
    public int amountOfBooks = 0;

    public Library(String libraryName, String adress) {
        this.libraryName = libraryName;
        this.adress = adress;
    }

    public void checkAvailability() {
        if (this.amountOfBooks > 0){
            for(int i = 0; i < this.amountOfBooks; i++) {
                if(avaibleBooks[i].amountAvailable > 0) {
                    System.out.printf("\nThe book %s is available, Amount: %d\n", avaibleBooks[i].title, avaibleBooks[i].amountAvailable);
                } else {
                    System.out.printf("\nThe book %s isn't available\n", avaibleBooks[i].title);
                }
            }
        } else {
            System.out.println("\nThere are no books available\n");
        }
    }

    public void signUpBook(Book book) {
        for (int i = 0; i < this.avaibleBooks.length; i++) {
            if (this.avaibleBooks[i] == null) {
                avaibleBooks[i] = book;
                amountOfBooks++;
                break;
            }
        }
    }
    
    /*
    Other way
     public void SingUpBook(Book book) {
        this.availableBooks[this.amountOfBooks] = book;
        this.amountOfBooks++;
     }
     */

    public Book locateBookPerTitle(String titleBook) {
        for(int i = 0; i < this.amountOfBooks; i++) {
            if(avaibleBooks[i].title.equalsIgnoreCase(titleBook)) {
                return this.avaibleBooks[i];
            }
        }
        return null;
    }
    
    public Book locateBookPerAuthor(String authorBook) {
        for(int f = 0; f < this.amountOfBooks; f++) {
            if(avaibleBooks[f].author.equalsIgnoreCase(authorBook)) {
                return this.avaibleBooks[f];
            }
        }
        return null;
    }
}

