package Interface;

import Model.Cargo;
import Model.Funcionario;

public interface IDAOEmpresa {
    void listarFuncionarios();
    void addFuncionarios(Funcionario<? extends Cargo> funcionario);
    void removerFuncionarios(Funcionario<? extends Cargo> funcionario);
    Funcionario<? extends Cargo> buscarFuncionario(Funcionario<? extends Cargo> funcionario);
}
