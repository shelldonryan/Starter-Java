package br.com.cz.vacinacao.Main;

import br.com.cz.vacinacao.Model.Aplicacao;
import br.com.cz.vacinacao.Model.CentroSaude;
import br.com.cz.vacinacao.Model.Paciente;
import br.com.cz.vacinacao.Model.Vacina;
import br.com.cz.vacinacao.Utils.SistemaGestao;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Paciente paciente = new Paciente();
        paciente.setCpf("0000");
        paciente.setNome("Ewerton");

        Vacina vacina = new Vacina();
        vacina.setLote("Coronga");
        vacina.setTipo("Intramuscular");
        //vacina.setDataValidade(LocalDate.of(2024, 10, 10));
        vacina.setDataValidade(LocalDate.of(2023, 11, 30));
        vacina.estaVencida();

        CentroSaude centroSaude = new CentroSaude();
        centroSaude.setNome("USB CZ");
        //centroSaude.setCapacidadeDeAramzenamento(11);
        centroSaude.setCapacidadeDeAramzenamento(10);
        centroSaude.temEquipamentoAdequado();

        Aplicacao aplicacao = new Aplicacao();
        aplicacao.setVacina(vacina);
        aplicacao.setPaciente(paciente);
        aplicacao.setDataAplicacao(LocalDate.now());

        SistemaGestao sistemaGestao = new SistemaGestao(1);
        sistemaGestao.centroSaudes.add(centroSaude);
        sistemaGestao.aplicacaos[0] = aplicacao;


    }
}