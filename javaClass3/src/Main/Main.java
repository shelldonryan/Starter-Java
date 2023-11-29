package Main;
import java.util.ArrayList;

import Model.Funcionario;
import Model.Gerente;
import Util.Empresa;
import Model.Cargo;
import Model.Diretor;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Funcionario<Gerente> gerente = new Funcionario<>("Shelldon");
        Gerente gerente1 = new Gerente(1234.21);

        Funcionario<Diretor> diretor = new Funcionario<>("Tawan");
        Diretor diretor1 = new Diretor(3214.32);

        empresa.dao.addFuncionarios(diretor);
        empresa.dao.addFuncionarios(gerente);

        empresa.dao.listarFuncionarios();
        System.out.println(empresa.dao.buscarFuncionario(diretor));
        System.out.println(empresa.dao.buscarFuncionario(gerente));

        ArrayList<Cargo> cargos = new ArrayList<>();
        cargos.add(gerente1);
        cargos.add(diretor1);

        empresa.listarSalarios(cargos);

    }
}
