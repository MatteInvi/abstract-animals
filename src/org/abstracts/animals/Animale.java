package org.abstracts.animals;

public abstract class Animale {
    String nome;

    protected Animale(String nome) {
        this.nome = nome;
    }

    protected void verso() {
        System.out.println("Verso generico");
    }

    protected void dormi() {
        System.out.println("Zzz");
    }

    protected String getNome() {
        return this.nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    public void vola() {
        System.out.println("Sto volando!!!");
    }

    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }

}
