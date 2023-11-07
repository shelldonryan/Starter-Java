package br.com.cz.empresa.model.Sistema;

import br.com.cz.empresa.contratos.IAcessoAContasBancarias;

public class SistemaRH {

    public void acessarConta(IAcessoAContasBancarias usuario){

        usuario.acessarContaBancaria();
    }

}
