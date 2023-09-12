package br.com.cz.zoologico.Model;

public class Zoo {
    public String name;
    public int currentAmountEnvironment;
    public Environment[] environments =  new Environment[5];

    public Zoo(String nome) {
        this.name = nome;
    }

    public void addEnvironment(Environment environment) {
        if (this.currentAmountEnvironment < this.environments.length) {
            this.environments[this.currentAmountEnvironment] = environment;
            this.currentAmountEnvironment++;
        } else {
            System.out.println("Environments already added");
        }
    }
}
