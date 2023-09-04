package Model;

public class Person {
    public String name;
    public int age;
    public String adress;
    public int numberCellphone;
    public String gender;

    public Person(String name, int age, String adress, int number, String gender) {
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.numberCellphone = number;
        this.gender = gender;
    }

    public void greet() {
        System.out.println("Hi, my name is " + name + "!");
    }

    public void exibirInformacoes() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Adress: " + adress);
        System.out.println("Cellphone: " + numberCellphone);
        System.out.println("Gender: " + gender);
    }

}
