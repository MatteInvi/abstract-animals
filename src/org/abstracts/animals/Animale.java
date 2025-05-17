package org.abstracts.animals;

public abstract class Animale {
    String nome;

    public Animale(String nome) {
        this.nome = nome;
    }

    void verso() {
        System.out.println("Verso generico");
    }

    void dormi() {
        System.out.println("Zzz");
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
