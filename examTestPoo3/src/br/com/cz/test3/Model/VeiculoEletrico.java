package br.com.cz.test3.Model;

import br.com.cz.test3.Interface.Recarregavel;

public class VeiculoEletrico implements Recarregavel{
    public void recarregar() {
        System.out.println("Veiculo carregando...");
    }

    public void verificarBateria() {
        System.out.println("Verificando baterias do veículo elétrico.");
    }
}
