package br.edu.fescfafic.poo.Model;

public class House {
    public String adress;
    public int amountOfConvenient;
    public int amountOfBedrooms;
    public int amountOfBathrooms;
    public int amountOfLivingRooms;
    public int amountOfDiningRooms;
    public int amountOfGym;
    public int amountOfGarage;
    public int amountOfBalcony;
    
    public House (String adress, int convenients, int bedrooms, int bathrooms, int livingRooms, int diningRooms, int gym, int garage, int balcony) {
        this.adress = adress;
        this.amountOfConvenient = convenients;
        this.amountOfBedrooms = bedrooms;
        this.amountOfBathrooms = bathrooms;
        this.amountOfLivingRooms = livingRooms;
        this.amountOfDiningRooms = diningRooms;
        this.amountOfGym = gym;
        this.amountOfGarage = garage;
        this.amountOfBalcony = balcony;
    }
}
