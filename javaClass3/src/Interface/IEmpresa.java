package Interface;
import java.util.ArrayList;
import Model.Cargo;

public interface IEmpresa {
    void listarSalarios(ArrayList<? extends Cargo> funcionarios);
}
