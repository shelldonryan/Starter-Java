package br.com.cz.empresa.model.Sistema;

import br.com.cz.empresa.contratos.IAcessoAVendas;

public class SistemaVendas {

    public void vender(IAcessoAVendas utilizador){
        utilizador.vender();
    }

}
