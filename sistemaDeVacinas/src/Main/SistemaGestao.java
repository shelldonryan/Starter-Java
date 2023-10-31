package Main;


import Interface.IPaciente;
import Interface.IVacina;
import Interface.ICentroSaude;
import Interface.IAplicacao;

import Exception.VacinaVencidaException;


public class SistemaGestao {
    private IVacina[] vacinas = new IVacina[4];
    private ICentroSaude[] centrosDeSaude = new ICentroSaude[4];
    private IAplicacao[] aplicacoes = new IAplicacao[4];

    public void registrarAlpicacao(IPaciente paciente, IVacina vacina, IAplicacao aplicacao) {
        if(vacina.isEstaVencida()) {
            throw new VacinaVencidaException("A vacina está vencida");
        }

        // IAplicacao aplicacao = new Aplicacao(paciente, vacina, LocalDate.of(2023, 12, 30));

        for (int i = 0; i < aplicacoes.length; i++) {
             if (aplicacoes[i] == null){
                 aplicacoes[i] = aplicacao;
             }
        }
        
        // for (int i = 0; i < vacinas.length; i++) {
        //     if (vacinas[i] == null){
        //         vacinas[i] = vacina;
        //     }
        // }
    }

    public void registrarCentroSaude(ICentroSaude centroDeSaude) {
        for (int i = 0; i < centrosDeSaude.length; i++) {
            if (centrosDeSaude[i] == null){
                centrosDeSaude[i] = centroDeSaude;
            }
        }
    }
    
    public void registrarCentroSaude(IVacina vacina) {
        for (int i = 0; i < vacinas.length; i++) {
            if (vacinas[i] == null){
                vacinas[i] = vacina;
            }
        }
    }
}
