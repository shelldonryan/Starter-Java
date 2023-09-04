package Model;

public class Vehicle {
    public String brand;
    public String model;
    public int year;
    public double price;

    public Vehicle(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Ano: " + year);
        System.out.println("Preço: R$" + price);
    }

    public double calculateIpva(double taxOfIpva) {
        return price * (taxOfIpva / 100);
    } 
}
