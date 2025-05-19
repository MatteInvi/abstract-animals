package org.abstracts.animals;

public class Delfino extends Animale implements INuotante {

    public Delfino(String nome) {
        super(nome);
    }

    @Override
    public void verso() {
        System.out.println("frigge");
    }


}
