package Utils;


import Interface.IVacina;
import Interface.ICentroSaude;
import Interface.IAplicacao;
import java.util.ArrayList;

import Exceptions.VacinaVencidaException;


public class SistemaGestao {
    public ArrayList<ICentroSaude> centrosSaude;
    public ArrayList<IVacina> vacinas;
    public IAplicacao[] aplicacoes;

    public SistemaGestao(int capacidadeAplicacao) {
        this.centrosSaude = new ArrayList<>();
        this.vacinas = new ArrayList<>();
        this.aplicacoes = new IAplicacao[capacidadeAplicacao];
    }

    public void registrarAplicacao(IVacina vacina) {
        try {
            if (vacina.isEstaVencida()) {
            throw new VacinaVencidaException("Esta vacina esta vencida");
            } else {
                vacinas.add(vacina);
            }
        } catch (VacinaVencidaException e) {
            System.err.println(e.getMessage());
        }
    }
}
