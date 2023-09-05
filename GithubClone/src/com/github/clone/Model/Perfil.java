package com.github.clone.Model;

public class Perfil {
    public String fotoDeUsuario;
    public String username;
    public String nomeCompleto;
    public String bio;
    public String[] redesSociais;
    public static final int QUANTIDADE_LISTA = 4;

    public Perfil(String foto, String username, String nomeCompleto, String bio) {
        this.fotoDeUsuario = foto;
        this.username = username;
        this.nomeCompleto = nomeCompleto;
        this.bio = bio;
        this.redesSociais = new String[QUANTIDADE_LISTA];
    }

    public void adicionarRedesSociais(String rede) {
        // adicioanr redes sociais
        for(int i = 0; i < QUANTIDADE_LISTA; i++) {
            if(this.redesSociais[i] == null) {
                this.redesSociais[i] = rede;
                break;
            }
        }
    }

    public void removerRedesSociais(String rede) {
        for(int i = 0; i < QUANTIDADE_LISTA; i++) {
            if(this.redesSociais[i].equals(rede)) {
                this.redesSociais[i] = null;
                break;
            }
        }
    }
}
