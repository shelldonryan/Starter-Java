package br.com.cz.vacinacao.Utils;

import br.com.cz.vacinacao.Interface.IAplicacao;
import br.com.cz.vacinacao.Interface.ICentroSaude;
import br.com.cz.vacinacao.Interface.IPaciente;
import br.com.cz.vacinacao.Interface.IVacina;
import br.com.cz.vacinacao.Model.CentroSaude;

import java.util.ArrayList;

public class SistemaGestao {

    public ArrayList<ICentroSaude> centroSaudes;
    public IAplicacao[] aplicacaos;

    public SistemaGestao(int aplicacaoCapacidade){
        this.aplicacaos = new IAplicacao[aplicacaoCapacidade];
        this.centroSaudes = new ArrayList<>();
    }

}
