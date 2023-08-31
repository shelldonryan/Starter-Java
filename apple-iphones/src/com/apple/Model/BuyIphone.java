package com.apple.Model;

public class BuyIphone {
    public String model;
    public String color;
    public int storage;
    public double value;
    public int cep;
    public int[] ceps = {51102346};
    public int iphoneInBag;

    public BuyIphone(String model, String color, int storage, double valueOfIphone) {
        this.model = model;
        this.color = color;
        this.storage = storage;
        this.value = valueOfIphone;
    }

    public void inputCep(int yourCep) {
        this.cep = yourCep;
    }

    public boolean delivery() {
        for (int i = 0; i < this.ceps.length; i++) {
            if (cep == ceps[i]) {
                return true;
            }
        }
        return false;
    }

    public void putInBag() {
        if (delivery()) {
            this.iphoneInBag += 1;
        }
        
    }
}
