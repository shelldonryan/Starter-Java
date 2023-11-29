package Interface;

public interface ILojaDeVeiculo {
    boolean inserirVeiculo(IVeiculo veiculo);

    boolean removerVeiculo(IVeiculo veiculo);
    boolean removerVeiculo(String codigo);

    IVeiculo buscarVeiculoPorChassi(String codigo);
}
