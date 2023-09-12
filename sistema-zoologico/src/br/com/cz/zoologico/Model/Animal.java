package br.com.cz.zoologico.Model;

public class Animal {
    public String name;
    public int amountOfLegs;
    public boolean hasATail;

    public void outputName() {
        System.out.println(this.name);
    }
}
