package br.com.cz.test4.Utils;

import java.util.ArrayList;

import br.com.cz.test4.Model.Usuario;

public class GerenciadorDeUsuarios {
    private ArrayList<Usuario> usuarios;

    public GerenciadorDeUsuarios() {
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario (Usuario usuario) {
        try {
            if(usuario.getIsAdmin()) {
               usuarios.add(usuario);  
            } else {
                throw new Exception("O usuario nao e admin");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }   
}
