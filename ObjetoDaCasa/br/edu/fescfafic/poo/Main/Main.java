package br.edu.fescfafic.poo.Main;
import br.edu.fescfafic.poo.Model.House;


public class Main {
    public static void main(String[] args) {
        House home = new House("Rua Castelo Branco", 17, 3, 4, 2, 1, 1, 3, 4);

        System.out.println("Adress from your house: " + home.adress);
        System.out.println("Amount of covenients: " + home.amountOfConvenient);
        System.out.println("Amount of bedrooms: " + home.amountOfBedrooms);
        System.out.println("Amount of bathrooms: " + home.amountOfBathrooms);
        System.out.println("Amount of living rooms: " + home.amountOfLivingRooms);
        System.out.println("Amount of dinning rooms: " + home.amountOfDiningRooms);
        System.out.println("Amount of gym: " + home.amountOfGym);
        System.out.println("Amount of garages: " + home.amountOfGarage);
        System.out.println("Amount of balconies: " + home.amountOfBalcony);
    }
}