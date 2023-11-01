package Main;

import java.time.LocalDate;
import Model.Aplicacao;
import Model.CentroSaude;
import Model.Paciente;
import Model.Vacina;
import Utils.SistemaGestao;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.setCpf("123321123213");
        paciente.setNome("Rodrigo Filura");

        Vacina vacina = new Vacina();
        vacina.setLote("Gripe");
        vacina.setTipo("Oral");
        vacina.setValidade(LocalDate.of(2023, 11, 30));

        CentroSaude centroSaude = new CentroSaude();
        centroSaude.setNome("Hospital Santa Terezinha");
        centroSaude.setCapacidadeArmazenamento(10);

        Aplicacao aplicacao = new Aplicacao();
        aplicacao.setPaciente(paciente);
        aplicacao.setVacina(vacina);
        aplicacao.setDataDeAplicacao(LocalDate.now());

        SistemaGestao sistemaGestao = new SistemaGestao(1);
        sistemaGestao.centrosSaude.add(centroSaude);
        sistemaGestao.aplicacoes[0] = aplicacao;
        sistemaGestao.registrarAplicacao(vacina);
    }
}
