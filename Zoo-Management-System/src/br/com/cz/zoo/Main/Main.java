package br.com.cz.zoo.Main;


import br.com.cz.zoo.Controllers.AmbienteController;
import br.com.cz.zoo.Controllers.ZooController;
import br.com.cz.zoo.Model.Ambiente;
import br.com.cz.zoo.Model.Zoo;
import br.com.cz.zoo.utils.SistemaMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=-=- SISTEMA GERENCIAMENTO ZOO -=-=");

        SistemaMenu menus = new SistemaMenu();
        AmbienteController ambienteController = new AmbienteController();
        ZooController zooController = new ZooController();

        while (true) {
            int op = menus.menuInicial();

            if (op == 1) {
                while (true) {
                    op = menus.menuZoo();

                    if (op == 1) {
                        Scanner ler = new Scanner(System.in);
                        System.out.print("=-=- Digite o nome do Zoo: ");
                        String nomeZoo = ler.nextLine();
                        System.out.print("=-=- Digite a localizacao: ");
                        String localizacao = ler.nextLine();
                        System.out.print("=-=- Digite o id: ");
                        int idZoo = ler.nextInt();
                        ler.nextLine();

                        Zoo zoo = new Zoo(nomeZoo, localizacao,idZoo);
                        boolean cadastro = zooController.cadastrar(zoo);

                        if (cadastro) {
                            System.out.println("=-=- CADASTRO ZOOLOGICO REALIZADO -=-=");
                        } else {
                            System.out.println("=-=- CADASTRO NAO REALIZADO -=-=");
                        }
                    } else if (op == 2) {
                        Scanner ler = new Scanner(System.in);
                        System.out.print("=-=- Digite o id do Zoologico: ");
                        int idZoo = ler.nextInt();
                        ler.nextLine();
                        boolean exclusao = zooController.excluir(idZoo);

                        if (exclusao) {
                            System.out.println("=-=- EXCLUSAO ZOOLOGICO REALIZADO -=-=");
                        } else {
                            System.out.println("=-=- EXCLUSAO NAO REALIZADA -=-=");
                        }
                    } else if (op == 3) {
                        Scanner ler = new Scanner(System.in);
                        System.out.print("=-=- Digite o id do Zoologico atual: ");
                        int idZooAtual = ler.nextInt();
                        ler.nextLine();

                        System.out.print("=-=- Digite o novo nome do Zoo: ");
                        String nomeZoo = ler.nextLine();
                        System.out.print("=-=- Digite a nova localizacao: ");
                        String localizacao = ler.nextLine();

                        Zoo zooNovo = new Zoo(nomeZoo, localizacao,idZooAtual);

                        boolean update = zooController.atualizacao(idZooAtual, zooNovo);

                        if (update) {
                            System.out.println("=-=- ATUALIZACAO ZOOLOGICO REALIZADO -=-=");
                        } else {
                            System.out.println("=-=- ATUALIZACAO NAO REALIZADA -=-=");
                        }
                    } else if (op == 4) {
                        ArrayList<Zoo> listarZoos = zooController.listarTodos();

                        if (listarZoos != null) {
                            System.out.println(listarZoos);
                        } else {
                            System.out.println("=-=- NAO FOI POSSIVEL LISTAR -=-=");
                        }
                    } else if (op == 0) {
                        System.out.println("=-=- VOLTANDO -=-=");
                        break;
                    } else {
                        System.out.println("=-=- OPCAO INVALIDA -=-=");
                    }
                }
            } else if (op == 2) {
                while (true) {
                    op = menus.menuAmb();

                    if (op == 1) {
                        Scanner ler = new Scanner(System.in);
                        System.out.print("=-=- Digite o tipo de Ambiente: ");
                        String tipoAmbiente = ler.nextLine();
                        System.out.print("=-=- Digite a capacidade: ");
                        int capacidade = ler.nextInt();
                        ler.nextLine();
                        System.out.print("=-=- Digite o id: ");
                        int idAmbiente = ler.nextInt();
                        ler.nextLine();

                        Ambiente ambiente = new Ambiente(tipoAmbiente, capacidade, idAmbiente);
                        boolean cadastro = ambienteController.cadastrar(ambiente);

                        if (cadastro) {
                            System.out.println("=-=- CADASTRO AMBIENTE REALIZADO -=-=");
                        } else {
                            System.out.println("=-=- CADASTRO NAO REALIZADO -=-=");
                        }
                    } else if (op == 2) {
                        Scanner ler = new Scanner(System.in);
                        System.out.print("=-=- Digite o id do ambiente: ");
                        int idAmb = ler.nextInt();
                        ler.nextLine();
                        boolean exclusao = ambienteController.excluir(idAmb);

                        if (exclusao) {
                            System.out.println("=-=- EXCLUSAO AMBIENTE REALIZADO -=-=");
                        } else {
                            System.out.println("=-=- EXCLUSAO NAO REALIZADA -=-=");
                        }
                    } else if (op == 3) {
                        Scanner ler = new Scanner(System.in);
                        System.out.print("=-=- Digite o id do Ambiente atual: ");
                        int idAmbAtual = ler.nextInt();
                        ler.nextLine();

                        System.out.print("=-=- Digite o novo tipo de ambiente: ");
                        String tipoAmbiente = ler.nextLine();
                        System.out.print("=-=- Digite a nova capacidade do Ambiente: ");
                        int capacidade = ler.nextInt();
                        ler.nextLine();

                        Ambiente ambNovo = new Ambiente(tipoAmbiente, capacidade, idAmbAtual);

                        boolean update = ambienteController.atualizacao(idAmbAtual, ambNovo);

                        if (update) {
                            System.out.println("=-=- ATUALIZACAO ZOOLOGICO REALIZADO -=-=");
                        } else {
                            System.out.println("=-=- ATUALIZACAO NAO REALIZADA -=-=");
                        }

                    } else if (op == 4) {
                        ArrayList<Ambiente> listarAmbs = ambienteController.listarTodos();

                        if (listarAmbs != null) {
                            System.out.println(listarAmbs);
                        } else {
                            System.out.println("=-=- NAO FOI POSSIVEL LISTAR -=-=");
                        }
                    } else if (op == 0) {
                        System.out.println("=-=- VOLTANDO -=-=");
                        break;
                    } else {
                        System.out.println("=-=- OPCAO INVALIDA -=-=");
                    }
                }
            } else if (op == 0) {
                System.out.println("=-=- SAINDO DO SISTEMA -=-=");
                break;
            } else {
                System.out.println("=-=- OPCAO INVALIDA -=-=");
            }
        }
    }
}
