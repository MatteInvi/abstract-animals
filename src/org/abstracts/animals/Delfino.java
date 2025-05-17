package org.abstracts.animals;

public class Delfino extends Animale implements INuotante {

    public Delfino(String nome) {
        super(nome);
    }

    @Override
    void verso() {
        System.out.println("frigge");
    }

    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }

}
