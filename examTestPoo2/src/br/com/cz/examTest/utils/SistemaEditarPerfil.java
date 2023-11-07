package br.com.cz.examTest.utils;

import br.com.cz.examTest.Model.Usuario;

public class SistemaEditarPerfil {
    public void editarPerfil(Usuario usuario) {
        if (usuario.getPodeEditar()) {
            System.out.println("Edicao pode ser realizada");
        } else {
            System.out.println("Acesso negado, permissao de edicao nao concedida");
        }
    }
}
