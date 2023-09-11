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
                    System.out.printf("\nThe book %s is available, Amount: %d", avaibleBooks[i].title, avaibleBooks[i].amountAvailable);
                } else {
                    System.out.printf("\nThe book %s isn't available", avaibleBooks[i].title);
                }
            }
        } else {
            System.out.println("\nThere are no books available");
        }
    }

    
}

