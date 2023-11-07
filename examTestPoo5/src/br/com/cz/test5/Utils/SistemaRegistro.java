package br.com.cz.test5.Utils;

import br.com.cz.test5.Model.Usuario;

public class SistemaRegistro {
    public void alterarRegistro(Usuario usuario) {
        try {
            if(usuario.getIsEditarRegistro()) {
                System.out.println("Alterando registro");
            } else {
                System.out.println("Não tem permissao para alterar");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
