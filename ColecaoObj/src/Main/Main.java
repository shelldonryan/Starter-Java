package Main;

import Model.Bicicleta;
import Model.Moto;
import Model.Carro;
import Util.LojaDeVeiculo;

public class Main {
    public static void main(String[] args) {
        LojaDeVeiculo lojaDeVeiculo = new LojaDeVeiculo();

        Bicicleta bicicleta = new Bicicleta("4402");
        Moto moto = new Moto("8922");
        Carro carro = new Carro("132123");

        lojaDeVeiculo.dao.inserirVeiculo(carro);
        lojaDeVeiculo.dao.inserirVeiculo(moto);
        lojaDeVeiculo.dao.inserirVeiculo(bicicleta);
        lojaDeVeiculo.dao.inserirVeiculo(bicicleta);

        System.out.println(lojaDeVeiculo.dao);
    }
}
