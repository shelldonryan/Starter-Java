package Main;

import java.time.LocalDate;
import java.util.Scanner;

import Exception.VacinaVencidaException;
import Model.Aplicacao;
import Model.CentroSaude;
import Model.Paciente;
import Model.Vacina;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaGestao sistemaI = new SistemaGestao();

        System.out.print("Digite o nome do centro de saude: ");
        String nomeCentroSaude = sc.nextLine();
        System.out.print("Digite a capacidade do centro de saude: ");
        int capacidadeArmazenamento = sc.nextInt();
        sc.nextLine();
        System.out.print("Tem equipamento adequado esse centro de saude(y/n): ");
        String resposta = sc.nextLine();
        boolean temEquipamento = false;
        if (resposta.toLowerCase().equals("y")) {
            temEquipamento = true;
        } else if(resposta.toLowerCase().equals("n")) {
            temEquipamento = false;
        }else {
            System.out.println("Resposta Incorreta");
        }
       CentroSaude centroDeSaude1 = new CentroSaude(nomeCentroSaude, capacidadeArmazenamento, temEquipamento); 

        System.out.print("\n\nDigite o nome do paciente: ");
        String nomePaciente = sc.nextLine();
        System.out.print("Digite o cpf do paciente: ");
        int cpfPaciente = sc.nextInt();
        sc.nextLine();
        Paciente paciente1 = new Paciente(nomePaciente, cpfPaciente);

        System.out.print("\n\nDigite o tipo da vacina: ");
        String tipoVacina = sc.nextLine();
        LocalDate validadeVacina = LocalDate.of(2023, 11, 30);
        System.out.print("Digite o lote da vacina: ");
        String loteVacina = sc.nextLine();
        System.out.print("Essa vacina esta vencida: ");
        boolean vacinaVencida = sc.nextBoolean();
        Vacina vacinaGripe = new Vacina(tipoVacina, validadeVacina, loteVacina, vacinaVencida);
        sc.nextLine();

        Aplicacao aplicacao1 = new Aplicacao(paciente1, vacinaGripe, LocalDate.of(2023, 10, 30));
        sc.close();

        sistemaI.registrarCentroSaude(centroDeSaude1);

        try {
            sistemaI.registrarAlpicacao(paciente1, vacinaGripe, aplicacao1);
        } catch (VacinaVencidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
