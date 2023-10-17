package br.com.cz.corretora.Model.Funcionarios;

public class AnalistaTecnologia extends Funcionario {
    
    public AnalistaTecnologia(String usuario, String senha, String nome, String historicoAcademico) {
        super(usuario, senha, nome, historicoAcademico);
    }

    @Override
    public String toString() {
        return "Analista de Investimentos{" +
                "Login= '" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                ", historicoAcademico=" + historicoAcademico + '\'' +
                '}'; 
    }
    
}
