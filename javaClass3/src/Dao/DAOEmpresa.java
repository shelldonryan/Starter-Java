package Dao;

import java.util.ArrayList;

import Model.Cargo;
import Model.Funcionario;
import Interface.IDAOEmpresa;

public class DAOEmpresa implements IDAOEmpresa{
    ArrayList<Funcionario<? extends Cargo>> funcionarios = new ArrayList<>();

    @Override
    public Funcionario<? extends Cargo> buscarFuncionario(Funcionario<? extends Cargo> funcionario) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if(funcionarios.get(i).equals(funcionario)) {
                return funcionarios.get(i);
            }
        }
        return null;
    }

    @Override
    public void addFuncionarios(Funcionario<? extends Cargo> funcionario) {
        funcionarios.add(funcionario);
    }
    
    @Override
    public void removerFuncionarios(Funcionario<? extends Cargo> funcionario) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if(funcionarios.get(i) == funcionario) {
                funcionarios.remove(i);
            }
        }
    }

    @Override
    public void listarFuncionarios() {
        for(int i = 0; i < funcionarios.size(); i++) {
            System.out.println(funcionarios.get(i));
        }
    }


}
