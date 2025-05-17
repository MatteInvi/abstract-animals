package org.abstracts.animals;

public class Passerotto extends Animale implements IVolante {

    public Passerotto(String nome) {
        super(nome);
    }

    @Override
    void verso() {
        System.out.println("cinguettio");
    }


}
