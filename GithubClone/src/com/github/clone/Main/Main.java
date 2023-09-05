package com.github.clone.Main;

import com.github.clone.Model.Perfil;

public class Main {
    public static void main(String[] args) {
        Perfil perfil = new Perfil(
            "https://avatars.githubusercontent.com/u/128086279?v=4",
            "shelldonryan",
            "Shelldon Ryan",
            "Sei não"
        );

        perfil.adicionarRedesSociais("Facebook");
        perfil.adicionarRedesSociais("X");
        perfil.adicionarRedesSociais("Instagram");
        perfil.adicionarRedesSociais("Twitter");

        System.out.println(perfil.redesSociais[0]);
        System.out.println(perfil.redesSociais[1]);
        System.out.println(perfil.redesSociais[2]);
        System.out.println(perfil.redesSociais[3]);

        perfil.removerRedesSociais("Facebook");

        System.out.println("");
        System.out.println(perfil.redesSociais[0]);
        System.out.println(perfil.redesSociais[1]);
        System.out.println(perfil.redesSociais[2]);
        System.out.println(perfil.redesSociais[3]);

    }
}
