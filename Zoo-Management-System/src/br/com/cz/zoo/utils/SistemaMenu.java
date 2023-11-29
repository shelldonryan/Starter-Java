package br.com.cz.zoo.utils;

import java.util.Scanner;

public class SistemaMenu {

    public SistemaMenu() {

    }

    public int menuInicial() {
        Scanner ler = new Scanner(System.in);
        System.out.println(
                "1 - Cadastrar Zoologico" + "\n" +
                "2 - Cadastrar Ambiente" + "\n" +
                "0 - Sair"
        );

        System.out.print("Digite a opcao: ");
        int op = ler.nextInt();
        return op;
    }

    public int menuZoo() {
        Scanner ler = new Scanner(System.in);

        System.out.println("""
                1 - Adicionar Zoologico
                2 - Remover Zoologico
                3 - Atualizar Zoologico
                4 - Listar todos os Zoo's
                0 - Voltar
                """);

        System.out.print("Digite a opcao: ");
        int op = ler.nextInt();
        return op;
    }

    public int menuAmb() {
        Scanner ler = new Scanner(System.in);

        System.out.println("""
                1 - Adicionar Ambiente
                2 - Remover Ambiente
                3 - Atualizar Ambiente
                4 - Listar todos os Amb's
                0 - Voltar
                """);

        System.out.print("Digite a opcao: ");
        int op = ler.nextInt();
        return op;
    }
}
