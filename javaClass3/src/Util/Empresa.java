package Util;

import Dao.DAOEmpresa;
import Interface.IEmpresa;
import Model.Cargo;
import java.util.ArrayList;

public class Empresa implements IEmpresa{
    public DAOEmpresa dao = new DAOEmpresa();

    @Override
    public void listarSalarios(ArrayList<? extends Cargo> funcionarios) {
        for (int i=0;i<funcionarios.size();i++){
            System.out.println(funcionarios.get(i).getSalario());
        }
    } 
}
