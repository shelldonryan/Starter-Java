package com.github.clone.Model;

public class Repositorio {

    public String name;
    public String descrition;
    public boolean pub;

    public Repositorio(String name, String descrition, boolean pub) {
        this.name = name;
        this.descrition = descrition;
        this.pub = pub;
    }

    public void mudarVisibilidade() {
        this.pub = !this.pub;
    }
}
