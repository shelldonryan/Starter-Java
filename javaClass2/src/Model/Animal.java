package Model;

import java.time.LocalTime;

abstract public class Animal {
    public String nome;
    public String nomeCientifico;
    public String somEmitido;
    public int membrosParaMovimento;
    public LocalTime horaDeDormir;

    public Animal(String nome, String nomeCientifico, String somEmitido, int membros, LocalTime horaDeDormir){
        this.nome = nome;
        this.nomeCientifico = nomeCientifico;
        this.somEmitido = somEmitido;
        this.membrosParaMovimento = membros;
        this.horaDeDormir = horaDeDormir;
    }

    public String dormir() {
        return nome + " já está a dormir, pois já são " + horaDeDormir.getHour() + ":" + horaDeDormir.getMinute();
    }

    public void emitirSom() {
        System.out.println("algum som do animal");
    }

    public void atividadePreferida() {
        System.out.println("Atividade Preferida desse animal");;
    }

    public void setName(String newName) {
        nome = newName;
    }
    public void setHour(LocalTime hourOfSleep) {
        horaDeDormir = hourOfSleep;
    }

    public void exibirInfo() {
        System.out.printf("""
                \nNome: %s
                Nome Cientifico: %s
                Quantidade de Membros: %d\n
                """, nome, nomeCientifico, membrosParaMovimento);
    }
}
