package br.com.cz.corretora.Model.Sistemas;

import br.com.cz.corretora.Contratos.IAcessoContatos;

public class SistemaAtendimentoCliente {
    public void contatoClientes(IAcessoContatos funcionario) {
        funcionario.listaDeClientes();
    }

    public void chatParaDuvidas(IAcessoContatos funcionario) {
        funcionario.chatDaEmpresa();
    }
    
    public void emailDaEmpresa(IAcessoContatos funcionario) {
        funcionario.emailDaEmpresa();
    }
}
