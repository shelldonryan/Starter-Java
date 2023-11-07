package br.com.cz.test3.Model;

import br.com.cz.test3.Interface.Recarregavel;

public class Smartphone implements Recarregavel{
    public void recarregar() {
        System.out.println("Smartphone: Carregando...");
    }

    public void verificarBateria() {
        System.out.println("Verificando bateria do smartphone");
    }
}
